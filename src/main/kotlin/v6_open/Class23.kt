package v6_open

/**
 * 协变 out 1,只能作为函数出参
 *          2, 支持泛型的继承,父类泛型的引用指向子类泛型的实现(默认情况不可以,加了out才可以),详情见main()函数,
 *              类似Java中的 ? extends T, 支持泛型的父类引用指向子类对象
 * @author lihao on 2022/3/20
 */
class Class23 {
}

interface Producer<out T> {
    //fun consumer(iterm: T) 不能作为入参, 因为有可能被修改
    fun produce() : T //可以作为出参
}

interface ProducerAndConsumer<T> {
    fun produce() : T //可以作为出参
    fun consumer(iterm: T) //可以作为入参
}

open class Animal
open class Humanity : Animal()
open class Man : Humanity()
open class Woman : Humanity()

class ProducerClass1 : Producer<Animal> {
    override fun produce(): Animal {
        println("生产者: Animal")
        return Animal()
    }
}
class ProducerClass2 : Producer<Humanity> {
    override fun produce(): Humanity {
        println("生产者: Humanity")
        return Humanity()
    }
}
class ProducerClass3 : Producer<Man> {
    override fun produce(): Man {
        println("生产者: Man")
        return Man()
    }
}
class ProducerClass4 : Producer<Woman> {
    override fun produce(): Woman {
        println("生产者: Woman")
        return Woman()
    }
}

fun main() {
    val p1 : Producer<Animal> = ProducerClass1()
    //支持泛型的继承,父类泛型的引用指向子类泛型的实现
    val p2 : Producer<Animal> = ProducerClass2()
    val p3 : Producer<Animal> = ProducerClass3()
    val p4 : Producer<Animal> = ProducerClass4()
}
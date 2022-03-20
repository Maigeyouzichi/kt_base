package v6_open

/**
 * 逆变 1,T 只能作为函数的入参
 *     2,类似 Java中的 ? super T, 子类的泛型引用可以指向父类的泛型对象
 * @author lihao on 2022/3/20
 */
class Class24 {
}

interface Consumer<in T> {
    fun consumer(iterm: T) //可以作为入参
    //fun produce() : T //不可以可以作为出参
}

class ConsumerClass1 : Consumer<Animal> {
    override fun consumer(iterm: Animal) {
        println("消费者: Animal")
    }
}
class ConsumerClass2 : Consumer<Humanity> {
    override fun consumer(iterm: Humanity) {
        println("消费者: Humanity")
    }
}
class ConsumerClass3 : Consumer<Man> {
    override fun consumer(iterm: Man) {
        println("消费者: Man")
    }
}
class ConsumerClass4 : Consumer<Woman> {
    override fun consumer(iterm: Woman) {
        println("消费者: Woman")
    }
}

fun main() {
    val p1 : Consumer<Man> = ConsumerClass1()
}
package v6_open

/**
 * 继承与重载
 * @author lihao on 2022/3/18
 */
class Class11 {
}
//kotlin所有的类默认是不可继承的
//open移除步final限制 -> 可继承
open class Person (val name: String) {
    //默认也有final修饰,不可以重写 -> 加入open后可以重写
    open fun showName() = "name: $name"

    fun personMethod() { println("父类方法")}
}

class Student(subName: String) : Person(subName) {

    override fun showName() = "Override name: $name"

    fun studentMethod() { println("子类方法")}
}

fun main() {

    val obj = Person("Java")
    println(obj.showName())

    val stu = Student("Python")
    println(stu.showName())
    println("----")

    val p : Person = Student("Kotlin")
    println(p.javaClass.toString())
    println(p.showName())
    println((p as Person).showName())
    println("----")
    p.personMethod()
    (p as Student).studentMethod()//父类引用调用重写方法->子类方法 父类引用调用子类特有方法->需要as转换,但是其实都是子类对象
    p.studentMethod()//as过一次 下面就可以自由调用了
    println((p as Person).javaClass)//还是student


    println("类型转换")

    var person = p as Person
    println(person.javaClass)
    println(person.showName())

}
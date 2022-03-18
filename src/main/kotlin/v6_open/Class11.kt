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
}

class Student(subName: String) : Person(subName) {

    override fun showName() = "Override name: $name"
}

fun main() {
    val obj = Person("Java")
    println(obj.showName())

    val stu = Student("Python")
    println(stu.showName())
}
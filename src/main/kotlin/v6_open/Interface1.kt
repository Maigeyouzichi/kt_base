package v6_open

/**
 * 接口
 * @author lihao on 2022/3/20
 */
interface Interface1 {
    val age: Int
    val name: String
    fun invoke(): String
}

class Interface1Impl(var weight: Int) : Interface1 {

    override val age: Int = 19
//        get() = field
//        set(value) {field = value}
    override var name: String = "Java"

    override fun invoke(): String {
        println("我是接口实现方法 ...")
        return "Hello World"
    }
}

fun main() {
    val obj = Interface1Impl(119)
    println(obj.age)
    println(obj.name)
    println(obj.weight)
    println(obj.invoke())
}

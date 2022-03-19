package v6_open

/**
 * 抽象类
 * @author lihao on 2022/3/20
 */
abstract class Class19 {
    var age: Int = 19
    fun function01(): Unit = run { println("Hello function01") }

    abstract fun function02(): String
    abstract fun function03(): Int
}

class Son01 : Class19() {
    override fun function02(): String {
        TODO("Not yet implemented")
    }

    override fun function03(): Int {
        TODO("Not yet implemented")
    }

}

fun main() {
    val obj = Son01()
    println(obj.age)
    obj.function01()
}
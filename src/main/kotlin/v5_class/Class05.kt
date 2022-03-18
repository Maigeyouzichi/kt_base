package v5_class

/**
 *  主构造 -> 次构造
 * @author lihao on 2022/3/18
 */
//主构造
class Class05() {
    var name: String? = null
    var sex: Char? = null

    //次构造 -> 需要先调动主构造
    constructor(_name: String = "Java", _sex: Char) : this() {
        name = _name
        sex = _sex
    }
}

class Class06 {

    // init块 -> 类似Java的构造块,构造方法执行前执行
    init {
        println("Hello World")
    }

    var name: String? = null
    var age: Int? = null
}

fun main() {
//    val obj = Class05()
//    val obj2 = Class05(_sex = 'M')
//    println(obj2.name)
    val obj = Class06()
    obj.name = "Java"
    obj.age = 19
    println(obj.name)
    println(obj.age)
}
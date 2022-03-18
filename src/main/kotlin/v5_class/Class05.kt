package v5_class

/**
 *  主构造 -> 次构造
 * @author lihao on 2022/3/18
 */
//主构造
class Class05() {
    var name : String? = null
    var sex : Char? = null

    //次构造 -> 需要调动主构造
    constructor(_name: String, _sex: Char) :this() {
        name = _name
        sex = _sex
    }
}

fun main() {
    val obj = Class05()
    val obj2 = Class05("Java",'M')
}
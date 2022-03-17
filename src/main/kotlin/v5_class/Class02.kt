package v5_class

/**
 * 计算属性和防范竞态条件
 * @author lihao on 2022/3/18
 */
class Class02 {
    val number: Int = 0

    //计算属性
    val number2 : Int
        get() = (1..1000).shuffled().first()

    // info 可能为null,也可能为"",这种情况需要防范竞态竞争 --> Kotlin编程规范
    private var info : String ? = /*null*/ ""

    fun getShowInfo() :String {
        return info?.let {
            it.ifBlank { "is empty" }
        } ?: "is null"
    }
}

fun main() {
    var obj = Class02()
    println(obj.number)
//    obj.number = 1
    println(obj.number2)
    println(obj.number2)

    var showInfo = obj.getShowInfo()
    println(showInfo)

}
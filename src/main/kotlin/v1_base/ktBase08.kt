/**
 * 函数
 * @author lihao on 2022/3/15
 */
//函数默认public修饰
private fun method (name: String, age : Int) : Int {
    println("姓名:${name},年龄:$age")
    return 200
}

fun main() {
    var res = method("John", 18)
    println(res)
}
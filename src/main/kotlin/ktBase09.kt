/**
 * 函数参数默认值
 * @author lihao on 2022/3/15
 */
fun main() {
    method01("lisi",11)
    method02("lisi")
    method03()
    method03("Jack",21)
    //具名函数
    method03(age=18, name = "lihao")
    method04()
    method05()
}

private fun method01 (name: String, age : Int) : Int {
    println("姓名:${name},年龄:$age")
    return 200
}
private fun method02 (name: String, age : Int = 19) : Int {
    println("姓名:${name},年龄:$age")
    return 200
}
private fun method03 (name: String ="lisi", age : Int=19) : Int {
    println("姓名:${name},年龄:$age")
    return 200
}
//unit函数
private fun method04(name: String = "Jay") : Unit {
    return println("hello world")
}

private fun method05(name: String = "Jay") {
    println("hello world")
}
/**
 * Nothing类型 : 抛出异常
 * @author lihao on 2022/3/15
 */
fun main() {
    var number = -1
    when(number) {
        -1 -> TODO("没有这种情况")
        in 1 .. 10 -> println("hello world")
    }
}
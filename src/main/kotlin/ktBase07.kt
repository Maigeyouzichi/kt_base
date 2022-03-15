/**
 * String模板
 * @author lihao on 2022/3/15
 */
fun main() {
    var name = "Tom"
    var time = 2

    println("今天和${name}玩了$time 小时")

    var isLogin = true
    println("${if (isLogin) "hello" else "world"}")
}
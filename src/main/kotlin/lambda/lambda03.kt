package lambda

/**
 * 1, lambda方法的引用
 * @author lihao on 2022/3/16
 */
fun main() {
    println(method01(18, ::method02))
}

/**
 * 函数作为参数的函数
 */
private inline fun method01(age: Int, method02: (age: Int) -> Int): Int {
    var b = method02(age)
    println(b)
    return b+1
}

private fun method02(age: Int) : Int {
    return age + 1
}
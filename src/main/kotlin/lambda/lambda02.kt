package lambda

/**
 * 进阶
 * 1, 函数作为参数
 * 2, inline 内联函数 减少调用栈
 * @author lihao on 2022/3/16
 */
fun main() {
    var a = method01(18) { age: Int -> age + 1 }
    println(a)
}

/**
 * 函数作为参数的函数
 */
private inline fun method01(age: Int, method02: (age: Int) -> Int): Int {
    var b = method02(age)
    println(b)
    return b+1
}
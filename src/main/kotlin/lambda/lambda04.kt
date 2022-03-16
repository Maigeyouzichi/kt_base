package lambda

/**
 * 函数作为返回值类型
 * @author lihao on 2022/3/16
 */
fun main() {
    var res = method(11)
    println(res(11, 11))
}

private fun method(age: Int): (Int, Int) -> Int {
    return { age1: Int, age2: Int ->
        age1 + age2 + age
    }
}
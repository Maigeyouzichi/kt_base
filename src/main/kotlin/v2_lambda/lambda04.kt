package v2_lambda

/**
 * 函数作为返回值类型
 * 具名函数
 * @author lihao on 2022/3/16
 */
fun main() {
//    var res = method(11)
//    println(res(11, 11))
//    showInfo(age=18, name = "Jack")
    method2(18,::method3Impl)
}

private fun method2(age: Int, method3: (Int) -> String) {
    var str = method3(age)
    println(str)
}

/**
 * 具名函数,调用是可以方法引用直接传入
 */
fun method3Impl (age: Int) :String {
    return "age : $age"
}

/**
 * 函数作为返回值
 */
private fun method(age: Int): (Int, Int) -> Int {
    return { age1: Int, age2: Int ->
        age1 + age2 + age
    }
}

/**
 * 入参写入顺序和方法无需一致
 */
private fun showInfo(name: String, age: Int, weight: Int = 160) {
    println("name: $name , age: $age , weight: $weight")
}
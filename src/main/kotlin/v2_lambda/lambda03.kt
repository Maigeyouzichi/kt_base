package v2_lambda

/**
 * 1, lambda方法的引用
 * @author lihao on 2022/3/16
 */
fun main() {
    println(method01(18, ::method02))

    var obj = ::method02//函数就是一个对象,对象类型是函数类型
    var obj2 = ::method01
    var obj3 = obj
}

/**
 * 函数作为参数的函数,即使是方法的引用,method01在声明时用了匿名函数作为入参,method01也应声明为inline函数
 * lambda属于函数类型的对象
 */
private inline fun method01(age: Int, method02: (age: Int) -> Int): Int {
    var b = method02(age)
    println(b)
    return b+1
}

private fun method02(age: Int) : Int {
    return age + 1
}
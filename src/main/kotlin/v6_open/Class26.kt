package v6_open

/**
 * infix关键字 (函数的扩展)
 * @author lihao on 2022/3/20
 *
 * ps: 文件也能扩展,import导入就可以用了,一个意思, 一样理解即可
 */
class Class26 {
}

infix fun <C1,C2> C1.myInfix(c2: C2) {
    println("打印C1: $this")
    println("打印C2: $c2")
}

fun main() {
    //infix函数 -> 写法的简便 这是mapOf函数自带的
    mapOf(1.to(2))
    mapOf(1 to 2)
    //这是自定义的
    "Hello".myInfix("World")
    "Java" myInfix "Python"
}
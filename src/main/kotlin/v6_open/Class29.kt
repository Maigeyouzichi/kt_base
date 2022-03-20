@file:JvmName("stu") //Java代码中使用Kotlin语法,讲该文件声明别名,直接使用别名调动即可
package v6_open

/**
 * 注解
 * @author lihao on 2022/3/20
 */
fun getStudentNameValueInfo(str: String) = println(str)

@JvmOverloads // 让Java像Kotlin一样调用Kotlin函数
fun show(name: String, age: Int = 19) {
    println("name: $name, age: $age")
}

class Class29 {
    @JvmField//这样Java中就可以直接使用age字段了
    val age: Int = 19

    companion object {
        const val name = "Java"
        @JvmStatic // 这样Java就可以当静态直接调用了
        fun staticFun() {
            println("我是static方法")
        }
    }
}

fun main() {
    show("Java")
    Class29.name
    Class29.staticFun()
}
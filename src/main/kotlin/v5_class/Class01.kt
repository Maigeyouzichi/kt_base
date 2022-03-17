package v5_class

/**
 * class
 * @author lihao on 2022/3/17
 */
class Class01 {
    var name = "Java"
    var info = "Java is best"
}

fun main() {
    var obj = Class01()
    println(obj.name)

    obj.name = "Kotlin"
    println(obj.name)
    println(Class01().name)

    println("---")

    var obj2 = Class01()
    println(obj == obj2)
    println(obj === obj2)

}
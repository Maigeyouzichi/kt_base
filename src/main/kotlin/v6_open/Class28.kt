package v6_open

/**
 * 变换函数 --> 类似Java中的stream()流
 * 1,map
 * 2, flatMap
 * @author lihao on 2022/3/20
 */
class Class28 {
}

fun main() {
    //map
    val list = listOf(1,2,3)
    val list2 = list.map { it+1 } // 类似Java中的stream中的map
    println(list)
    println(list2)
    println("map操作---")
    //flatMap
    var flatMap = list.flatMap { listOf(it + 1) }
    for (obj in flatMap) {
        println(obj)
        println(obj.javaClass.toGenericString())
    }
    println("flatMap操作----")
    //filter
    println(list.filter { it > 2 })
    println("filter操作-----")
    //zip操作
    val list3 = listOf("Java","Kotlin")
    var zip = list.zip(list3)
    println(zip.toMap())
    println("zip操作------")
}
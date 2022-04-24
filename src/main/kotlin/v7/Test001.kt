package v7

/**
 *
 * @author lihao on 2022/4/24
 */
data class Test001(val id: Long, val name: String)

fun main() {
    var list = listOf<Test001>()
    var map = list.associateBy { it.id }
    println(map)
}
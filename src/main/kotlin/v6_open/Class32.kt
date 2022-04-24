package v6_open

/**
 *
 * @author lihao on 2022/3/31
 */
fun main() {

    var list1 = listOf(Material(1, 100), Material(2, 200),Material(2, 300))
    var list2 = listOf(Material(1, 200), Material(2, 400))
    var list3 = listOf(Material(3, 133), Material(1, 155))

    var set = mutableSetOf<Pair<Int,Int>>()

    val map =  mapOf(1 to list1, 2 to list2, 3 to list3)
    val res = listOf(map).map { e ->
        e[1]!!.map { 1 to it.unitId }+e[2]!!.map { 2 to it.unitId }
    }.flatten().toSet()
    println(res)
}
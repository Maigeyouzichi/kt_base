package v4_coll

/**
 * Map
 * @author lihao on 2022/3/17
 */

fun main() {
    MapTest().function4()
}

class MapTest {

    /**
     * 可变map
     */
    fun function4() {
        var map = mutableMapOf(1 to "Java", 2 to "Kotlin")
        map[3] = "Python"
        for (entry in map) { println("key: ${entry.key} value: ${entry.value}") }
        println("---")

        var value = map.getOrPut(4) { "Shell" }
        println("value: $value")
        for (entry in map) { println("key: ${entry.key} value: ${entry.value}") }
        println("---")
    }

    /**
     * 遍历
     */
    fun function3() {
        var map = mapOf(1 to "Java", 2 to "Kotlin")

        map.forEach { (t, u) -> println("key: $t value: $u") }
        println("---")

        map.forEach { println("key: ${it.key} value: ${it.value}") }
        println("---")

        for (entry in map) { println("key: ${entry.key} value: ${entry.value}") }
        println("---")
    }

    /**
     * read
     */
    fun function2() {
        var map = mapOf(1 to "Java", 2 to "Kotlin")
        println(map[1])
        println(map[3]) // 找不到返回null,不会崩

        var def = map.getOrDefault(3, "Python")
        println(def)

        var elseValue = map.getOrElse(3) { "Go" }
        println(elseValue)

//        map.getValue(1) 慎用,如果key不存在会抛出异常
    }

    /**
     * new
     */
    fun function1() {
        var map = mapOf(1 to "Java", 2 to "Kotlin")
        println(map)
        var map2 = map.toMutableMap()
        map2[3] = "Python"
        println(map2)

        var map3 = mapOf(Pair(1, 2), Pair(2, 2))
        println(map3)
    }
}
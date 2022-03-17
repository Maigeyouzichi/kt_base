package v4_coll

/**
 * set
 * @author lihao on 2022/3/17
 */
fun main() {
    SetTest().function3()
}
class SetTest {

    /**
     * set <-> list
     */
    fun function3() {
        var list = mutableListOf<String>("Java","Java","kotlin")
        var set = list.toSet()
        println(set)
        var list2 = set.toMutableList()
        println(list2)
        list2 += "Java"
        println(list2)
        var list3 = list2.distinct()
        println(list3)
    }

    /**
     * 可变set
     */
    fun function2() {
        var set = mutableSetOf("hello","world","Java")
        println(set)
        set.add("Kotlin")
        set += "Python"
        println(set)
    }

    /**
     * 普通set
     */
    fun function1() {
        var set = setOf(3,2,1,3)
        println(set)
        println(set.elementAtOrElse(0) { -1 })
        println(set.elementAtOrNull(0))
    }
}
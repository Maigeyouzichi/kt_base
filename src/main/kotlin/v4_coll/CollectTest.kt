package v4_coll

/**
 * kotlin集合
 * @author lihao on 2022/3/17
 */

fun main() {
    CollectTest().function5()
}

class CollectTest {

    /**
     * 解构
     */
    fun function5() {
        var list = listOf(1, 2, 3, 4)
        var (v1, v2, v3) = list
        //v1 = -1
        println("v1: $v1, v2: $v2, v3: $v3")
    }

    /**
     * 遍历
     */
    fun function4() {
        var list = listOf(1, 2, 3, 4)
        //第一种
        for (num in list) {
            print(num)
            print(" ")
        }
        println()

        //第二种
        list.forEach() {
            print(it)
            print(" ")
        }

        println()

        //第三种
        list.forEachIndexed { index, iterm ->
            println("下标: $index")
            println("元素: $iterm")
        }

    }

}

/**
 * mutator
 */
fun function3() {
    var list = mutableListOf(1, 2, 3)
    list += 4
    list -= 1
    println(list)

    list.removeIf { it == 2 }
    println(list)
}

/**
 * 可变list
 */
fun function2() {
    var list: MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4)
    println(list)

    list.add(5)
    println(list)

    list.removeAt(0)
    println(list)

    println("-----")

    //不可变list -> 可变list
    var list2 = listOf(1, 2, 3)
    var list3 = list2.toMutableList()
    println(list3)
    list3.add(4)
    list3 += 5
    println(list3)
    list3 -= 5
    println(list3)

    // 可变 -> 不可变
    var list4 = list3.toList()
}

/**
 *  不可变list
 */
fun function1() {
    var list = listOf("hello", "world", "Kotlin")
    println(list[0])
    //防止下标异常
    var value = list.getOrElse(10) { "越界值" }
    println(value)
    var value2 = list.getOrNull(10)
    println(value2)
}
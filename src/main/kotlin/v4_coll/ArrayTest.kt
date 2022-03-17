package v4_coll

import java.util.Arrays

/**
 * Array
 * @author lihao on 2022/3/17
 */
fun main() {
    ArrayTest().function1()
}
class ArrayTest {

    fun function1() {
        var arr = intArrayOf(0,1,2,3,4)
        var ele = arr.elementAtOrElse(5) {-1}
        println("ele: $ele")
        var ele2 = arr.elementAtOrNull(5)
        println("ele: $ele2")

        var list = arr.toList()
        println(list)

        var intArray = list.toIntArray()
        println(intArray.contentToString())

    }
}
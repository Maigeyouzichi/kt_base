package v3_

import kotlin.math.roundToInt

/**
 * 安全转换
 * @author lihao on 2022/3/17
 */
fun main() {
    Trancefer().function02()
}

class Trancefer {

    /**
     * 字符串 -> 数字
     */
    fun funtion1(): Unit {
        var num: Int = "999".toInt()
        println(num)

        var num2: Int? = "999.9".toIntOrNull() //转换的时候首选
        println(num2)
    }

    /**
     * double -> int
     */
    fun function02() {
        var num1 :Int = 555.555.toInt()
        println(num1)

        var num2 :Int = 555.45.toInt()
        println(num2)


        var num3 :Int = 555.555.roundToInt()
        println(num3)

        var num4 :Int = 555.45.roundToInt()
        println(num4)

        var str : String = "%.3f".format(123.4567890)//保留三位小数
        println(str)
    }
}
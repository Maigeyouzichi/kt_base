/**
 * range表达式(嵌套if) & when表达式
 * @author lihao on 2022/3/15
 */
fun main() {
    val number = 148

    //range 表达式
    if (number in 10 .. 59) {
        println("不及格")
    }else if (number in 0 ..9) {
        println("不及格并分数很差")
    }else if (number in 60 .. 100) {
        println("合格")
    }else if (number !in 0 .. 100) {
        println("分数不在范围内")
    }

    //when 表达式
    when (number) {
        in 10 .. 59 -> {
            println("不及格")
        }
        in 0 ..9 -> {
            println("不及格并分数很差")
        }
        in 60 .. 100 -> {
            println("合格")
        }
        !in 0 .. 100 -> {
            println("分数不在范围内")
        }
    }

    val week = 6

    val info = when(week) {
        1 -> "周一"
        2 -> "周二"
        3 -> "周三"
        4 -> "周四"
        5 -> "周五"
        else -> println("周末")
    }
    println(info)
}
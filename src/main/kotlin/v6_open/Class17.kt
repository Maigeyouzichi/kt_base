package v6_open

/**
 * 枚举
 * 1,枚举的值等价于枚举本身
 * 2,
 * @author lihao on 2022/3/19
 */
class Class17 {}

enum class Week(val num: Int, val code: String) {
    MONDAY(1, "mon"),
    TUESDAY(2,"tue"),
    WEDNESDAY(3,"wed"),
    THURSDAY(4,"thu"),
    FRIDAY(5,"fri")

}

fun main() {
    println(Week.FRIDAY.num)
    println(Week.FRIDAY.code)
}


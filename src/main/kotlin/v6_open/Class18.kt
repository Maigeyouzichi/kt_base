package v6_open

/**
 * 密封类 -> 枚举的扩展,如果希望使用枚举的同时还需要带动态的参数, 可以使用密封类
 * @author lihao on 2022/3/19
 */
class Class18 {}

sealed class Exams {
    //单例 继承
    object Fraction1 : Exams() //分数差
    object Fraction2 : Exams() //分数及格
    object Fraction3 : Exams() //分数良好
    //非对象
    class Fraction4(val studentName: String) : Exams() //分数优秀
}

class Teachers(private val exam: Exams) {
    fun show() =
        when(exam) {
            is Exams.Fraction1 -> "该学生分数很差"
            is Exams.Fraction2 -> "该学生分数及格"
            is Exams.Fraction3 -> "该学生分数良好"
            is Exams.Fraction4 -> "该学生分数优秀,该生的名字: ${exam.studentName}"
        }
}

fun main() {
    println(Teachers(Exams.Fraction1).show())
    println(Teachers(Exams.Fraction2).show())
    println(Teachers(Exams.Fraction3).show())
    println(Teachers(Exams.Fraction4("Jay")).show())
}
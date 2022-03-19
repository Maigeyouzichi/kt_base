package v6_open

/**
 * 泛型
 * @author lihao on 2022/3/20
 */
class Class20<T> (private val obj: T) {
    fun show() = run { println("万能输出对象: $obj")}
}

data class Teacher01(private var name: String,private var age: Int )
data class Student01(private var name: String,private var age: Int )

fun main() {
    val tea = Teacher01("teacher",20)
    val stu = Student01("student",19)

    Class20(tea).show()
    Class20(stu).show()
}
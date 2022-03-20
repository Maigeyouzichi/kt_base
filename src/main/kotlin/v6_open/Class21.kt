package v6_open

/**
 * 泛型转换
 * @author lihao on 2022/3/20
 */
class Class21<T>(val isMap: Boolean = false, val inputType: T) {
    inline fun <R> map(mapAction: (T) -> R): R? = mapAction(inputType).takeIf { isMap }
}

open class Father01() {}
class Son1 : Father01() {}
class Son2{}

fun generic(T: Father01) { }

fun main() {
    val p1 = Class21(isMap = true, inputType = 123)
    val r: String? = p1.map { it.toString()}//it就指传入的T类型的inputType
    println(r)
    println(r is String)

    //泛型类型约束
    generic(Son1())
//    generic(Son2()) 没有继承Father,无法使用该写法
}
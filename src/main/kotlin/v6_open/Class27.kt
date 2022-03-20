package v6_open

/**
 * DSL
 * @author lihao on 2022/3/20
 */
class Class27 {}

class Context {
    val info = "Java"
    val name = "Tom"
    fun toast(str: String) = println("toast: $str")
}

//表达式种如果需要传递类中的方法, 需要在入参声明时声明类名
//该函数就符合DSL编程范式 ->
// 1,定义lambda输入,输入必须是Context这个类才有资格调用apply5函数,匿名函数里面持有it和this
// 2,定义lambda输出,最终返回Context对象本身
// 3,调用方(main函数)进行具体实现
inline fun Context.apply5(lambda: Context.(String) -> Unit): Context {
    lambda(info)
    return this
}

inline fun function27() {
    println("--------")
}

fun main() {
    val context = Context().apply5 {
        toast("success")
        toast(it)
        toast(name)
        function27()
    }
    println()
    println(context.info)
}
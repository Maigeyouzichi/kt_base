package v6_open

/**
 * 扩展函数
 * @author lihao on 2022/3/20
 */
class Class25(val name: String, val age: Int) {
}

//不动原来的类,额外的增加扩展函数,同时可以使用原来类中的字段, 这就是扩展函数
fun Class25.show() {
    println("我是扩展函数,可以获取原来类的字段数据: name: $name , age: $age")
}

//如果对超类进行扩展, 任何类都可以使用了 (这不是破坏了JVM的纯净性了吗?)
fun Any.doExtend() {
    println("我是超类 ...")
}

//甚至可以去直接重写原来就有的函数, 效果上直接进行覆盖

//泛型也能扩展
fun <T> T.doExtend2() {
    if (this is String) println("这是String")
}

//手写内置函数
private inline fun<I,O> I.mLet(lambda: (I) ->O) : O = lambda(this)

fun main() {
    Class25("Java", 19).show()
    Class25("Java",18).doExtend()
    "Hello world".doExtend2()

    println("Java".mLet {
        println(it)
        "Hello Java"
    })
}

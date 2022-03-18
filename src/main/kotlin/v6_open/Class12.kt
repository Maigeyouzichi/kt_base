package v6_open

/**
 * 单例模式 -> 名字既是类名,又是单例对象
 * @author lihao on 2022/3/18
 */
object Class12 {
}

open class Parent {
    open fun add () {println("我是父类的add")}
    open fun del () {println("我是父类的del")}
}

interface CallBack {
    fun action()
}

fun main() {
//    println(Class12)
//    println(Class12)
//    println(Class12)
//    println(Class12)//名字就是指向单例对象

    //匿名类继承父类
    var obj = object : Parent() {
        override fun add(){ println("我是匿名类的add")}
        override fun del(){ println("我是匿名类的del")}
    }
    obj.add()

    //对于Kotlin的接口
    object : CallBack {
        override fun action() {
            println("hello ...")
        }
    }.action()

    //对于Java的接口,也可以这么做 -- 这里是简化写法
    var obj2 = Runnable { println("TODO(\"Not yet implemented\")") }
}
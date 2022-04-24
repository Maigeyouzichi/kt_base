package v3_

import sun.security.util.Password

/**
 * apply -> 1, 返回值为其对象本身 2,this表示对象本身 3,也支持具名函数方法引用
 * let ->   1,let的返回值根据最后一行确定(也符合匿名函数规则) 2,let种的it表示集合或者对象本身.
 * run ->   1, 返回值最后一行确定 2,持有this 3,支持匿名函数 4,支持具名函数
 * with -> 类似run
 * also -> 类似apply 1,返回obj本身 2, 使用it
 * takeIf -> 大部分配合 :? 空操作符一起使用
 * takeUnless -> 同takeIf相反
 * @author lihao on 2022/3/17
 */
fun main() {
    ApplyTest().function07()
}

class ApplyTest {

    /**
     * takeIf
     */
    fun function07() {
        var name = "lisi"
        var password = "12345"
        //如果checkPassword()返回TRUE,res=name,否则,res=null
        val res = name.takeIf{checkPassword(name,password)}
        res?.let { println("res: $res") } ?: println("密码错误")
    }

    fun checkPassword(name: String, password: String) : Boolean {
        return name == "lisi" && password == "123456"
    }

    /**
     * also
     */
    fun function06() {
        var str = "周杰伦"
        str.also(::printHello)
            .also(::printWorld)
    }

    /**
     * with
     */
    fun function05() {
        var str = "周杰伦"
        with(str,::printHello)
        with(str,::printWorld)
    }

    /**
     * apply
     */
    fun function04() {
        var str: String = "Jay"
        str.apply(::addHello).apply(::addWorld)
    }
    fun addHello(string: String) {
        println("$string hello")
    }

    fun addWorld(string: String) {
        println("$string world")
    }
    /**
     * run
     */
    fun function03() {
        var str = "Java"
        str
            .run(::printHello)
            .run(::printWorld)//支持优雅的链式调用
        //str.run { printHello(this) }
    }

    fun printHello(str: String) :String{
        println("$str: hello")
        return str
    }
    fun printWorld(str: String) {
        println("$str: world")
    }

    /**
     * let
     */
    fun function02() {
        var list = listOf(1, 2, 3)
        var first = list.let {
            var first = it.first()
            println(first + first)
            first
        }
        println(first)
    }

    /**
     * apply
     */
    fun function01(): Unit {
        var info :String = "hello world"
        //普通方式
        println("length: ${info.length}")
        println("last char : ${info[info.length-1]}")
        println("to upperCase: ${info.toUpperCase()}")
        //内置函数 apply -> 始终返回这个info本身
        var res = info.apply {// 返回值res没有意义
            // apply函数不持有it,但是持有this,this指info本身
            println("length: ${length}")
            println("last char : ${this[length-1]}")
            println("to upperCase: ${toUpperCase()}")
            this.substring(0, 6)
        }.apply {
            //支持链式调用,始终返回info本身
        }
        println("info: $info")//hello world
        println("res: $res") //hello world  始终返回这个info本身
    }
}
package lambda

/**
 *
 * @author lihao on 2022/3/16
 */
fun main() {
    //function01()
    //function02()
    //function03()
    //function04()
    function05()
}

/**
 * 匿名函数类型推断
 */
private fun function05() {
    val method = {name:String,age:Int ->
        //推断类型为String
        "name: $name , age: $age"
    }
    println(method("Jack", 19))
}

/**
 * it关键字 如果只有一个参数,it指其本身
 */
private fun function04() {
    val method : (String)-> String = {
        "$it Java"
    }
    println(method("Hello"))
}

/**
 * 匿名函数
 */
private fun function03() {

    val method : (Int,Int) -> Int = { a,b ->
        println("a: $a")
        println("b: $b")
        a + b
    }
    println("a+b: ${method(1,2)}")
}

/**
 * 匿名函数
 */
private fun function02() {
    //1:函数输入输出的声明
    val methodAction : () -> String
    //2:函数实现
    methodAction = {
        val age = 11
        "$age Java"
    }
    //3,函数调用
    //println(methodAction)
    //1:函数输入输出的声明
    //2:函数实现
//    val methodAction : () -> String = {
//        val age = 11
//        "$age Java"
//    }
    //3,函数调用
    println(methodAction())
}

/**
 * 计数
 * 增加条件计数
 */
private fun function01() {
    val len = "hello".count()
    println(len)//5

    val rlen = "hello".count(){
        it == 'l'
    }
    println(rlen)//2
}
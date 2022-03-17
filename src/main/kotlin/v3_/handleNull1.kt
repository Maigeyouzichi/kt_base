package v3_

/**
 * @author lihao on 2022/3/17
 */
fun main() {
    function6()
}

/**
 * let函数 + 空合并操作
 */
fun function6() {
    var name : String? = "lisi"
    //name = null
    var res = name?.let { "{$it}" } ?: "我是null"
    println(res)
}

/**
 * 空合并操作
 */
fun function5() {
    var name: String ? = null
    var res = name ?: "我是null"
    println(res)
}

/**
 * 强制执行
 */
fun function4() {
    var name: String? = "Derry"
    //name.capitalize() 编译不通过
    name!!.capitalize()//强制执行,如果为空,该报错报错
}

/**
 * let安全调用
 */
fun function3() {
    var name: String? = "2333"
    var res = name?.let {
        // it == name 本身
        // 如果能执行到这里,it一定不为null
        it.ifBlank {
            "default"
        }
    }
    println(res)
}

/**
 * 安全调用操作符
 */
fun function2() {
    var name: String? = "lisi"
    name = null
//    name.capitalize() name可以为空,使用可能有问题, 如果需要使用,需要增加补救措施
    name?.capitalize() //如果name为null,?后面的代码不执行,没有空指针
}

/**
 * kotlin可空性特点
 */
fun function1() {
    //todo 第一种情况: 本身不可以为null
//    var name: String = null
    //todo 第二种情况: 声明时指定为可空类型
    var name: String? = null
}
package v6_open

/**
 * 数据类
 * 使用场景: 1,服务器响应回来的JavaBean
 *          2,主构造函数至少有一个参数
 *          3,不能使用 open abstract sealed inner ..
 * @author lihao on 2022/3/19
 */
data class Class15(var name: String) {
    var age: Int = 19
    var weight : Int? = null

    constructor(_weight: Int, name: String) :this(name) {
        weight = _weight
    }
}

//普通类
class ResponseResultBean(var msg: String, var code: Int)
//-> set get constructor

//数据类 -> JavaBean的形式下,用数据类
data class ResponseResultBean2(var msg: String, var code: Int)
//-> add: 重写了 toString hashcode equals copy 但是参数只会使用主构造的参数,其余字段忽略!!!
fun main() {
    var commonBean = ResponseResultBean("success",200)
    var commonBean2 = ResponseResultBean("success",200)
//    println(commonBean.toString())
//    println(commonBean.hashCode())
    println(commonBean == commonBean2)//false
    println(commonBean === commonBean2)//false

    var bean = ResponseResultBean2("Bad request", 500)
    var bean2 = ResponseResultBean2("Bad request", 500)
//    println(bean.toString())
//    println(bean.msg)
    println(bean == bean2)//true
    println(bean === bean2)//false

    println("----")

    var obj = Class15("Java")
    var copy = obj.copy(name = "Java")
    var obj2  = Class15("Java")
    obj2.age = 11
    obj2.weight = 101
    copy.age = 11
    copy.weight = 103
    println(obj.toString())
    println(copy)
    println(obj == obj2)
    println(obj == copy)
    println("-----------")

    var obj11 = Class15(100,"Python")
    println(obj11.toString())
}
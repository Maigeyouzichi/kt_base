package v5_class

/**
 * 构造函数
 * @author lihao on 2022/3/18
 */
//主构造函数规范来说都是增加_xxx,临时的输入类型,不能直接用
class Class03(_age: Int, _name: String) {
    //    fun show() {println(_age)} 不能直接使用, 用变量接受才可以用
    var name = _name
    var age = _age;

    fun show() {println(name) }
}

//主构造器方式二
class Class04(var age: Int,var name: String){
    fun show() {  println(age)}
}

fun main() {
    val obj = Class03(16, "Jack")
    println(obj.age)
    obj.age = 19
    println(obj.age)
    println("----")
    val obj2 = Class04(16, "Java")
    println(obj2.name)
    obj2.show()
}
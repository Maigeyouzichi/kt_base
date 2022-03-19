package v6_open

/**
 * 解构
 * @author lihao on 2022/3/19
 */
class Class16 {
}

class StructureClass1 () {
    var age : Int = 19
    var name : String = "Java"
}

data class StructureClass2 (val age: Int, val name: String) { }

class StructureClass3 (_age: Int, _name: String) {
    //解构项: age name 这也可以再使用时用var(x,y)接收,可以显示声明, data类自动声明
    operator fun component1() = age
    operator fun component2() = name

    var age: Int = _age
    var name :String = _name
}

fun main() {
    val(age,name) = StructureClass3(19,"Java")
    println("age: $age , name: $name")
}
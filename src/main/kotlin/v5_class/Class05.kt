package v5_class

/**
 *  主构造 -> 次构造
 * @author lihao on 2022/3/18
 */
//主构造
class Class05() {
    var name: String? = null
    var sex: Char? = null

    //次构造 -> 需要先调动主构造
    constructor(_name: String = "Java", _sex: Char) : this() {
        name = _name
        sex = _sex
    }
}

class Class06 {

    // init块 -> 类似Java的构造块,构造方法执行前执行
    init {
        println("Hello World")
    }

    var name: String? = null
    var age: Int? = null
}

/**
 * kotlin初始化顺序流程: 调用次构造 -> 调用主构造 -> 执行主构造 -> field和init一个level,自上向下执行->次构造
 */
class Class07(_name: String, _sex: Char) {

    init {
        println("init代码块打印name: $_sex")
        println("init代码块打印name: $_name")
    }

    //赋值和init代码块谁在前谁先执行
    var name = _name
    var sex = _sex

    constructor(_name: String, _sex: Char, age: Int) : this(_name, _sex) {
        println("次构造执行 ....")
    }
}

/**
 * kotlin延时加载
 */
class Class08 {
    //声明延时加载
    lateinit var name: String
    //判断是否加载
    fun checkInit(): Boolean {
        return ::name.isInitialized
    }
    //加载
    fun initName() {
        name = "Java"
    }
}

fun main() {
//    val obj = Class05()
//    val obj2 = Class05(_sex = 'M')
//    println(obj2.name)

//    val obj = Class06()
//    obj.name = "Java"
//    obj.age = 19
//    println(obj.name)
//    println(obj.age)

    var obj = Class08()
    if (obj.checkInit()) {
        println(obj.name)
    }
    obj.initName()
    println(obj.name)
}
package v3_

/**
 * 字符串操作
 * == ===
 * @author lihao on 2022/3/17
 */

fun main() {
    function07()
}

/**
 * 遍历
 */
fun function07(): Unit {
    var str = "hello world"
    str.forEach {
        println(it)
    }
}


/**
 * == && ===
 */
fun function06() {
    // == 值 内容的比较  -> Java的equals()
    // === 引用的比较
    var value1 = "Java"
    var value2 = "Java"
    println(value2 == value1)
    println(value2 === value1)
    println("----------------")
    var age1 :Int = 199999
    var age2 : Int = 199999
    println(age1 == age2)
    println(age1 === age2)
    println("----------------")
    var str1 = "Derry"
    var str2 = "derry".capitalize()
    println(str1 == str2)
    println(str1 === str2) //不会使用常量池,会新启一个对象
}

const val INFO = "Hello World"

/**
 * replace 加密 解密
 */
fun function05() {
    var sourcePassword = "123456"
    var newPassword = sourcePassword.replace("1", "A")
    println(sourcePassword)
    println(newPassword)
}

/**
 * subString
 */
fun function04() {
    var substring = INFO.substring(1, 3)
    println(substring)
}

/**
 * split -> list
 */
fun function03() {
    var list = INFO.split(" ")
    println(list)
}
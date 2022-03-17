package v3_

/**
 * handle exception in kotlin
 * @author lihao on 2022/3/17
 */
fun main() {
    function02()
}

/**
 * 先决条件函数
 */
private fun function02() {
    var value1 : String? = null
//    checkNotNull(value1)
//    requireNotNull(value1)

    var value2 : Boolean = true
//    require(value2) 如果为false,会抛出异常
}

/**
 * exception handle
 */
fun function01() {
    try {
        var name : String? = null
        checkException(name)
        name!!.length
    }catch (e: Exception) {
        println(e.message)
        println(e.cause)
        println(e.toString())
        for (element in e.stackTrace) {
            println(element)
        }
    }
}

fun checkException(name: String?) {
    name ?: throw IllegalAccessException("代码健壮性校验未通过!")
}

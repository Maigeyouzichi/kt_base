/**
 * 反引号`` (波浪线的键位)
 * @author lihao on 2022/3/15
 * {@link ktBase12.class}
 */
fun main() {
    我是一个函数("Jay")
    //调用Java的函数时函数名和kotlin关键字冲突,使用反引号区分
    ktBase12.`is`()
}

//中文可以作为方法名
private fun `我是一个函数`(name:String) {
    println("姓名:${name}")
}
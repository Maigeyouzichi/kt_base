package v6_open

/**
 * 可变参数
 * @author lihao on 2022/3/20
 */
class Class22<T> (vararg objects: T, var isMap: Boolean) {
    //out T只能被读取 不能修改
    private val objectArray: Array<out T> = objects

//    fun showObj(index: Int) :T? = objectArray[index].takeIf { isMap }
    fun showObj(index: Int) :Any = objectArray[index].takeIf { isMap } ?:"Hello World"//这样类型就是Any了

    fun <O> map(index: Int, mapAction: (Any) -> O) = mapAction(showObj(index))
}

fun main() {
    val obj = Class22("Java",134,123.44f,12.34,'J',true, isMap = true)
    println(obj.showObj(1))

}
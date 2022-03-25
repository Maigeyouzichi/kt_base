package v6_open

import java.math.BigDecimal

/**
 * @author lihao on 2022/3/25
 */
fun BigDecimal?.equalsTo(others: Any?): Boolean {
    if (others !is BigDecimal) return false
    return this?.compareTo(others) == 0
}

fun main() {
    val list = listOf<BigDecimal>(BigDecimal(0),BigDecimal(0),BigDecimal(3),BigDecimal(4),BigDecimal(5))
    var res = list.filter { !it.equalsTo(BigDecimal.ZERO) }
    println(res)
}

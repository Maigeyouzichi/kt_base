package v6_open

import jdk.nashorn.internal.codegen.MapCreator
import kotlin.collections.Map as Map1

/**
 *
 * @author lihao on 2022/3/29
 */
class Class31(val id:Int, val name: String) {

}

fun main() {
//    val obj1 = Class31(1,"Java")
//    val obj2 = Class31(2,"kt")
//    val obj3 = Class31(3,"Py")
//    val obj4 = Class31(3,"go")
//
//    val list = listOf<Class31>(obj1,obj2,obj3,obj4)
//    var associateBy = list.associateBy { it.id }
//    for (entry in associateBy) {
//        println(entry.key)
//        println(entry.value.id)
//        println(entry.value.name)
//        println("---")
//    }

//    var map1 = mapOf<String, String>("1" to "Java", "2" to "kotlin")
//    var map2 = mapOf<String, String>("1" to "Java_", "4" to "kotlin_")
//    val map3 = map1 + map2
//    println(map3)

//    val list = emptyList<Int>()
//    var find = list.find { it == 1 }
//    println(find)
    var list1 = listOf(Material(1, 100), Material(2, 200),Material(2, 300))
    var list2 = listOf(Material(1, 200), Material(2, 400))
    var list3 = listOf(Material(3, 133), Material(1, 155))

//    var g1 = list1.groupBy({ it.id }, { it.unitId })
//    println(g1)
//    var g2 = list2.groupBy({ it.id }, { it.unitId })
//    println(g2)
//    var g3 = list3.groupBy({ it.id }, { it.unitId })
//    println(g3)
//
//    var groupBy = (g1.entries + g2.entries + g3.entries).groupBy({ it.key }, { it.value })
//    var mapValues = groupBy.mapValues { it.value.flatten().distinct() }
//    println(mapValues)

    val map =  mapOf(1 to list1, 2 to list2, 3 to list3)
    val res = listOf(map).map { e ->
        e.get(1)!!.groupBy({it.id},{it.unitId})+
        e.get(2)!!.groupBy({it.id},{it.unitId})+
        e.get(3)!!.groupBy({it.id},{it.unitId})
    }
    println(res)



//    println(g1.toMutableMap().apply { putAll(g2) })


    //<Int -List<Int>> = 1 -> [100,300,155]
//    val list = list1+list2+list3
//    println(list)
//    var res:Map<Int,List<Int>> = list.groupBy({ it.id }, { it.unitId })
//    println(res)

}

data class Material (val id: Int, val unitId: Int) {}




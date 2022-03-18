package v6_open;

/**
 * 1,内部类  1.1 使用inner修饰 1.2 内外部可以相互访问,内部可以直接访问内部
 * 2,嵌套类  2.1 外部可以访问内部, 内部不可以直接访问外部,但可以通过对象方式访问
 * @author lihao on 2022/3/18
 */

class Outer {
    var nameOuter = "name_outer"
    fun method01() {
        println(Inner1().nameInner1)
        println(Inner1().Inner2().nameInner2)
    }

    inner class Inner1 {
        var nameInner1 = "name_inner1"
        fun method02() {
            println(nameOuter)
            println(Inner2().nameInner2)
        }

        inner class Inner2 {
            var nameInner2 = "name_inner2"
            fun method03() {
                println(nameOuter)
            }
        }
    }
}

class Outer2 {
    var nameOuter = "name_outer"
    fun method01() {
        Nested().nameInner
    }

    class Nested {
        var nameInner = "name_Inner"
        fun method02() {
//            nameOuter
            Outer2().nameOuter
        }
    }
}
package com.kt

import java.util.Arrays
import kotlin.test.Test

/**
 * 基础测试
 * @author lihao on 2022/3/16
 */
class KtBaseTest01 {

    @Test
    fun test001 () {
        var a = 1;
        a += 1;
        println(a)
    }

    @Test
    fun test002() {
//        var c = max01(1,2);
//        println(c)
        println(max02(1, 2))
    }

    fun max01 (a:Int,b:Int) :Int {
        return if (a>b) a  else b
    }

    fun max02 (a:Int,b:Int) = if (a>b) a else b


    @Test
    fun test003() {
        getType(1L)
        getType("hello")
    }
    fun getType(obj:Any) {
        if (obj is String) println("我是字符串")
        if (obj is Int) println("我是Int")
    }

    @Test
    fun test004() {
        val list = listOf(1,2,3)
        for (i in list) {
            println(i)
        }
    }

    @Test
    fun test005() {
        var a = 1;
        var b = 1;
        println(a == b)
        var c = 10000
        var d = 10000
        println(c == d)
    }

    @Test
    fun test006() {
        var arr01 = arrayOf(1,2,3);
        println(arr01.contentToString())
        println(arr01[0])

        var arr02 = Array(5) { i -> (i * i).toString() }
        println(arr02.contentToString())
    }

    @Test
    fun test007() {
        var age : Int = 11
        var name = "zhangsan"
        var name2 : String? = null
        //name = name2 String 和 String 是完全不同的两个东西 不可以相互赋值
        name = name2 !!
        name2 = name
    }

}
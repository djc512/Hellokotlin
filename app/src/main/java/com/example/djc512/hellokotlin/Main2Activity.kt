package com.example.djc512.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tv.text = "hello"
        btn.setOnClickListener { Toast.makeText(this@Main2Activity, "hello", Toast.LENGTH_SHORT).show() }
    }

    val age: Int = 10
    val sex = "male"//常量类似final,类型可以自动转换
    var i: Int = 3
    var name = "xiaoqiang"//类型可以自动转换
    /**
     *参数为整
     *返回值类型为Int
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * 没有返回值
     * 没有参数
     * Unit类似与void,也可以不写
     */
    fun sum(): Unit {

    }

    /**
     * 也可以直接写，参数类型不写，会自动转换与方法sum一样
     */
    fun sum1(a: Int, b: Int) = a + b

    /**
     * if语句
     * 方法名为Kotlin语法
     * if语句格式为java语言
     */
    fun method(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    /**
     *参数类型可以自动转换
     */
    fun method1(a: Int, b: Int) = if (a > b) a else b

    /**
     * for循环
     * arr参数名
     * Array<String> 参数类型
     */
    fun min(arrs: Array<String>) {
        for (arr in arrs) {
            println(arr)
        }
        /**
         * 遍历数组所对应的角标
         */
        for (i in arrs.indices) {
            println(arrs[i])
        }
    }

    /**
     * while循环
     */
    fun min1(arrs: Array<String>) {
        var i = 0//会自动转换类型
        while (i < arrs.size) {
            println(arrs[i++])
        }
    }

    /**
     * 数据类型为List集合
     */
    fun min2(list: List<String>) {
        for (i in list.indices) {
            println(list.get(i))
        }
        /**
         * 第二种写法
         */
        for (str in list) {
            println(str)
        }
    }

    /**
     * switch功能,
     */
    fun min2(a: Int) {
        when (a) {
            1 -> println(1)
            2 -> println(2)
            else -> println(3)
        }
    }

    /**
     * 参数类型为String
     */
    fun min3(s: String) {
        when (s) {
            "1" -> println("1")
            "2" -> println("2")
            else -> println("3")
        }
        var i = 0
        //使用in 判断一个数值是否在一个范围里面
        if (i in 1..10) {
            println(i)
        }
        //判断一个数值是否不再一个范围里面
        if (i !in 1..10) {
            println(i)
        }
    }

    /**
     * 判断变量是否在集合中
     */
    fun min3(list: List<String>) {
        var s = "h"
        if (s in list) {
            println(s)
        }
    }

    /**
     * 空指针校验
     * ?声明返回值可以为空
     */
    fun min4(strs: List<String>): String? {
        var s: String? = null
        if (s in strs) {
            return s
        } else {
            return null
        }
    }

    //换一种写法
    var str: String? = null//申明变量类型，？标识可以为null

    fun str(lists: List<String>): String? = if (str in lists) str else null

    /**
     * 使用is 判断是不是同一个数据类型，类似java的 instance of
     */
    fun isStr(obj: Any): String? {
        if (obj is String && obj.length > 0) {
            return obj
        }
        return null
    }

    //换一种写法
    fun isString(obj: Any): String? = if (obj is String) obj else null
}

/**
 *总结
 * var 作为修饰符标识可变数据类型，可以不用声明数据类型，会根据后面赋值的数据自动转换类型
 * val 表示变量数值不可变，类似java代码里面的final修饰的数据，也可以不用事先申明数据类型
 * Unit表示没有返回值，类似java的void,如果不写默认没有返回值，如果有返回值会自动推断
 * for 循环的使用使用关键字in 进行数据的遍历
 * for 循环可以通过变量名.indices获取角标集合
 * if 语句的普通判断与java代码一致
 * if 语句也可以使用in 进行判断一个变量是否再一个范围之内，或者是否为一个集合的数据，！in表示不属于
 * if 语句可以简略进行缩写
 * while 的用法与java代码基本一直
 * when 语句的功能与java的switch更加方便
 *is 关键字可以用来判断是否为一个指定的数据类型，类似java的instance of
 * in 关键字可以用来for循环的遍历，也可以用来if语句的判断
 * Any 表示任意数据类型
 *一个数据类型后面添加?，标识这个数据类型可以为null
 */
var a: Int = 0
var a1 = 0
val b: Int = 0
val b1: String? = null

fun method(list: List<Int>) {
    for (l in list) {
        println(l)
    }
    var i = 0
    for (i in list.indices) {
        println(list.get(i))
    }
}

fun method1(a: Int, b: Int) = if (a > b) a else b
fun method2(a: Int, b: Int): Int = if (a > b) a else b

fun method3(a: Int) = if (a in 1..10) a else null
fun method4(a: Int) = if (a !in 1..10) a else null

fun method5(a: Int): Int {
    if (a in 1..10) {
        return a
    }
    return 0
}

fun method6(a: Int): Int {
    when (a) {
        1 -> return 1
        2 -> return 2
        else -> return 0
    }
}

fun method7(arr: List<String>): Boolean {
    return b1 in arr
}

fun method8(obj: Any): Boolean {
    return obj is String
}



package com.saic.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.saic.android.bean.CustomBean

@Route(path="/app/demo")
class DemoActivity : AppCompatActivity(){
    var list = mutableListOf<Int>()
    var items = ArrayList<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        initData()

//        foo()
        test()
    }

    fun initData(){
        var cBean = CustomBean("name",2)
        cBean.name = "测试名称"
        cBean.address
        print("address = ${cBean.address}")

//        list.swap(2,4)

    }

    fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
        val tmp = this[index1] // “this”对应该列表
        this[index1] = this[index2]
        this[index2] = tmp
    }

    fun foo(){
        var test = object{
            var x : Float = 0f
            var y : Float = 0f
        }
        print("x = ${test.x} ,y = ${test.y}")
    }




    interface Base {
        val message: String
        fun print()
    }

    class BaseImpl(val x: Int) : Base {
        override val message = "BaseImpl: x = $x"
        override fun print() { println(message) }
    }

    class Derived(b: Base) : Base by b {
        // 在 b 的 `print` 实现中不会访问到这个属性
        override val message = "Message of Derived"
        override fun print() { println("Derived $message") }
    }

    fun test() {
        val b = BaseImpl(10)
        val derived = Derived(b)
        derived.print()
        println(derived.message)
    }

}
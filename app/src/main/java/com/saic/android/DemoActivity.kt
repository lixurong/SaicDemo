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
        initData()

        foo()
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
}
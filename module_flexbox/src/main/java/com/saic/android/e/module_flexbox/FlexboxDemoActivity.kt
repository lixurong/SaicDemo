package com.saic.android.e.module_flexbox

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.saic.android.e.module_flexbox.databinding.FlexboxLayoutBinding
import java.util.*


@Route(path = "/flex/demo")
class FlexboxDemoActivity : AppCompatActivity() {
    lateinit var binding: FlexboxLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.flexbox_layout)
        var list = ArrayList<String>()
        list.add("影视天堂")
        list.add("程序员")
        list.add("美食")
        list.add("漫画.手绘")
        list.add("广告圈")
        list.add("旅行.在路上")
        list.add("影视天堂")
        list.add("程序员")
        list.add("美食")
        list.add("漫画.手绘")
        list.add("广告圈")
        list.add("旅行.在路上")
        binding.list = list
    }

    fun goRecycler(view: View) {
        when (view.id) {
            R.id.go_recycler -> ARouter.getInstance().build("/flex/recycler").navigation()
        }
    }


}
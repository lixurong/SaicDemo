package com.saic.android.e.module_flexbox.viewmodel

import android.arch.lifecycle.ViewModel
import com.saic.android.e.module_flexbox.R
import me.tatarka.bindingcollectionadapter2.BR
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
import me.tatarka.bindingcollectionadapter2.itembindings.OnItemBindClass

class FlexRecyclerViewModel : ViewModel(){
    var adapter = BindingRecyclerViewAdapter<String>()
    var items = getList()
    var itemBinding = OnItemBindClass<String>().map(String::class.java){itemBinding, position, item ->
        itemBinding.clearExtras().set(BR.item, R.layout.flex_item)
    }

    private fun getList():ArrayList<String>{
        var list = java.util.ArrayList<String>()
        list.add("影视天堂")
        list.add("程序员")
        list.add("美食")
        list.add("漫画.手绘")
        list.add("广告圈")
        list.add("旅行.在路上")
        return list
    }
}
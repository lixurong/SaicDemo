package com.saic.android.e.module_ucenter.module

import android.databinding.ObservableField
import android.databinding.ObservableInt

class UUserBean {

    var name = ObservableField<String>()
    var brief = ObservableField<String>()
    var level = ObservableInt()
    var gender = ObservableInt()

    fun onClick(user: UUserBean) {
        user.name.set("点击后名称")
        user.brief.set("简介")
        user.gender.set(0)
    }
}
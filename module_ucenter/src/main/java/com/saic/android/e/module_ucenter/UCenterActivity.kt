package com.saic.android.e.module_ucenter

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.jaeger.library.StatusBarUtil
import com.saic.android.e.module_ucenter.databinding.ActivityUcenterBinding
import com.saic.android.e.module_ucenter.module.UUserBean

@Route(path="/ucenter/main")
class UCenterActivity : AppCompatActivity(){
    lateinit var name : String

    lateinit var dataBinding : ActivityUcenterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setTranslucent(this)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_ucenter)
        var bean = UUserBean()
        bean.brief.set("hello world")
        name = intent.getStringExtra("name")
        if(name.isNullOrBlank()){
            name = "昵称"
        }
        bean.name.set(name)

        bean.level.set(1)
        bean.gender.set(1)
        dataBinding.user = bean
    }

}
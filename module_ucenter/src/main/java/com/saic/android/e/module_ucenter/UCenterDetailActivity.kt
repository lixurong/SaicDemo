package com.saic.android.e.module_ucenter

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.saic.android.e.module_ucenter.databinding.DetailUcenterBinding
import com.saic.android.e.module_ucenter.module.UUserBean

@Route(path="/ucenter/detail")
class UCenterDetailActivity:AppCompatActivity(){
    lateinit var user : UUserBean

    lateinit var dataBinding : DetailUcenterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.detail_ucenter)
        user = intent.getSerializableExtra("user") as UUserBean
        user?.let {
            dataBinding.user = it
        }

    }

}
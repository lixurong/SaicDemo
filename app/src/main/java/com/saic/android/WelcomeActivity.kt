package com.saic.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.jaeger.library.StatusBarUtil
import com.saic.android.saicdemo.R
import com.saic.android.util.RxCountDown


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setTranslucent(this)
        setContentView(R.layout.activity_welcome)
        goMain()
    }

    fun goMain() {
        RxCountDown.countdown(1)
                .doOnComplete {
                    ARouter.getInstance().build("/home/main").navigation()
                    finish()
                }
                .subscribe()

    }

}
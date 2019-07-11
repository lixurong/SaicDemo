package com.saic.android

import android.app.Application
import android.os.Build
import com.alibaba.android.arouter.launcher.ARouter
import com.saic.android.util.Util

class App : Application() {
    companion object {
        lateinit var instance: App
    }


    override fun onCreate() {
        super.onCreate()
        instance = this
        if (Util.isDebug()) {
            //打印日志
            ARouter.openLog()
            //开启deubg
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}
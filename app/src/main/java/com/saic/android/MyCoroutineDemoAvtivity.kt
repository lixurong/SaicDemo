package com.saic.android

import android.os.Bundle
import android.provider.Settings
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Route(path="/coroutine/demo")
class MyCoroutineDemoAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        test()
    }

    fun test(){
        GlobalScope.launch {
            delay(1000L)
            print("World!")
        }
        println("Hello ")
    }
}
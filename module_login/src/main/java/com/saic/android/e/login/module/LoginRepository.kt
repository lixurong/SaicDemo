package com.saic.android.e.login.module

import android.util.Log
import com.saic.android.e.login.DataRequetListener
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class LoginRepository{

    fun goLogin(listener : DataRequetListener){
        var gologin = runBlocking {
            launch {
                Log.i("login","开始登陆")
                delay(500L)
                Log.i("login","登陆成功1  ${Thread.currentThread().name}")

                listener?.let {
                    listener.onSuccess("{\"name\":\"Nick\",\"brief\":\"Hello\",\"gender\":\"1\",\"city\":\"南京\"}")
                }
            }
        }
    }
}
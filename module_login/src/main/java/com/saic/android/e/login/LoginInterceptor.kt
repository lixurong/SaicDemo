package com.saic.android.e.login

import android.content.Context
import android.text.TextUtils
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor
import com.saic.android.e.login.constants.Variable

@Interceptor(name = "login", priority = 1)
class LoginInterceptor : IInterceptor {
    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
        when (postcard?.path) {
            "/ucenter/main" -> {
                if (Variable.UserName.isNullOrBlank()) {
                    Log.e("ivy", " 进行了拦截处理！")
                    callback?.onInterrupt(RuntimeException("异常"))
                }else{
                    callback?.onContinue(postcard)
                }
            }
            else -> callback?.onContinue(postcard)
        }


    }

    override fun init(context: Context?) {
        Log.e("ivy", " 拦截器初始化！")
    }

}
package com.saic.android.e.login

import android.util.Log
import android.view.View
import com.alibaba.android.arouter.launcher.ARouter
import com.google.gson.Gson
import com.saic.android.e.login.constants.Variable
import com.saic.android.e.login.module.LoginRepository
import com.saic.android.e.login.module.UserBean
import com.saic.android.e.module_base.BaseViewModel

class LoginViewModel : BaseViewModel() {
    var repository: LoginRepository = LoginRepository()

    fun goLogin(view: View) {
        repository.goLogin(object : DataRequetListener {
            override fun onSuccess(response: String) {
                Log.i("login", "登陆成功=$response")
                var user = Gson().fromJson<UserBean>(response, UserBean::class.java)
                Log.i("login", "登陆成功=${Thread.currentThread().name}")
                user?.let {
                    Variable.UserName = user.name
                    ARouter.getInstance().build("/ucenter/main")
                            .withString("name", user.name)
                            .withString("brief", user.brief)
                            .withInt("gender", user.gender)
                            .navigation()
                    context?.finish()
                }
            }

            override fun onFailure(error: String) {
            }
        })
    }
}
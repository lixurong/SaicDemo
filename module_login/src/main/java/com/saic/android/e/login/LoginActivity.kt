package com.saic.android.e.login

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextUtils
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.jaeger.library.StatusBarUtil
import com.saic.android.e.login.constants.Variable
import com.saic.android.e.login.databinding.ActivityLoginBinding
import com.saic.android.e.login.module.UserBean
import kotlinx.android.synthetic.main.activity_login.*

@Route(path = "/login/login")
class LoginActivity : AppCompatActivity() {
    @Autowired
    lateinit var path: String

    lateinit var dataBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setTranslucent(this)
        StatusBarUtil.setLightMode(this)
        ARouter.getInstance().inject(this)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setListener()

    }


    private fun setListener() {
        go_login.setOnClickListener {
            var name = name_et.text
            var pwd = name_et.text
            if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(pwd)) {
                Variable.UserName = name.toString()
                if(path.isNotEmpty()) {
                    ARouter.getInstance().build(path)
                            .withString("name", name.toString())
                            .withString("pwd", pwd.toString())
                            .navigation()
                }else{
                    ARouter.getInstance().build("/ucenter/main")
                            .withString("name", name.toString())
                            .withString("pwd", pwd.toString())
                            .navigation()
                }
                finish()
            }
        }
    }

}
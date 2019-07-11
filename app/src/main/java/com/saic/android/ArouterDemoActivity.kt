package com.saic.android

import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.ContextMenu
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.saic.android.saicdemo.R
import kotlinx.android.synthetic.main.activity_aroute.view.*

/**
 *  这里的路径需要注意的是至少需要有两级，/xx/xx
 */
@Route(path = "/route/demo")
class ArouterDemoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aroute)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.go_login -> ARouter.getInstance().build("/login/login").navigation()
            R.id.go_login_with_params -> {
                var bundle = Bundle()
                bundle.putString("name", "test")
                bundle.putString("pwd", "123456")
                ARouter.getInstance().build("/login/login").with(bundle).navigation()
            }
            R.id.go_login_with_scheme -> {
                var uri = intent.data
                ARouter.getInstance().build(uri).withString("username","username1").withString("pwd","12345678").navigation()
            }
            R.id.go_ucenter ->{
                ARouter.getInstance().build("/ucenter/main").navigation()
            }
            R.id.go_list ->{
                ARouter.getInstance().build("/home/main").navigation()
            }
            R.id.go_flexbox ->{
                ARouter.getInstance().build("/flex/demo").navigation()
            }

        }
    }
}
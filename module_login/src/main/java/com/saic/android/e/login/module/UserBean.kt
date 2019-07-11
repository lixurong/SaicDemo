package com.saic.android.e.login.module

import android.databinding.ObservableField
import android.databinding.ObservableInt

class UserBean {
    var name = ObservableField<String>()
    var email = ObservableField<String>()
    var age = ObservableInt()
}
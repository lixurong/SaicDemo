package com.saic.android.e.module_base

import android.app.Activity
import android.arch.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {
    var context by Weak<Activity>()
}
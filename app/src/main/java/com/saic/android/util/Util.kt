package com.saic.android.util

import android.content.pm.ApplicationInfo
import com.saic.android.App


class Util {
    companion object {
        fun isDebug(): Boolean {
            return (App.instance.applicationInfo != null && (App.instance.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE) !== 0);
        }
    }
}
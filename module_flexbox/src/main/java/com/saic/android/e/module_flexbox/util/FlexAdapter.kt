package com.saic.android.e.module_flexbox.util

import android.databinding.BindingAdapter
import android.view.View
import com.google.android.flexbox.FlexboxLayoutManager

class FlexAdapter {

    companion object {
        @JvmStatic
        @BindingAdapter("layoutManager")
        fun layoutManager(view: View, item: String) {
            var params = view.layoutParams
            if (params is FlexboxLayoutManager.LayoutParams) {
                params.flexGrow = 1.0f
            }
        }
    }

}
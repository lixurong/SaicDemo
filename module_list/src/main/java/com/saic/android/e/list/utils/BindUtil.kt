package com.saic.android.e.list.utils

import android.databinding.BindingAdapter
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.saic.android.e.module_list.R

class BindUtil {
    companion object {
        @JvmStatic
        @BindingAdapter("item_type")
        fun setType(typeTv: TextView, type: String) {
            when (type) {
                "1" -> {
                    typeTv?.text = "接机"
                    typeTv?.setTextColor(typeTv.resources.getColor(R.color.type1_color))
                    typeTv?.setBackgroundResource(R.drawable.type1_bg)
                }
                "2" -> {
                    typeTv?.text = "往返单"
                    typeTv?.setTextColor(typeTv.resources.getColor(R.color.type2_color))
                    typeTv?.setBackgroundResource(R.drawable.type2_bg)
                }
                "3" -> {
                    typeTv?.text = "送机"
                    typeTv?.setTextColor(typeTv.resources.getColor(R.color.type3_color))
                    typeTv?.setBackgroundResource(R.drawable.type3_bg)
                }
                "4" -> {
                    typeTv?.text = "包车"
                    typeTv?.setTextColor(typeTv.resources.getColor(R.color.type4_color))
                    typeTv?.setBackgroundResource(R.drawable.type4_bg)
                }
                "5" -> {
                    typeTv?.text = "点到点"
                    typeTv?.setTextColor(typeTv.resources.getColor(R.color.type5_color))
                    typeTv?.setBackgroundResource(R.drawable.type5_bg)
                }
            }
        }

        @JvmStatic
        @BindingAdapter("item_tags")
        fun setTags(tagsLayout: LinearLayout, tags: String) {
            if (!tags.isNullOrBlank()) {
                if (tagsLayout?.childCount == 0) {
                    var tags = tags.split(",")
                    for (tag in tags) {
                        var tagTv = TextView(tagsLayout.context)
                        tagTv.text = tag
                        tagTv.setTextColor(tagsLayout.resources.getColor(R.color.type5_color))
                        tagTv.textSize = 11f
                        var params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                        params.rightMargin = 10
                        params.gravity = Gravity.CENTER_VERTICAL
                        tagTv.layoutParams = params
                        tagTv.setPadding(10, 4, 10, 4)
                        tagTv.setBackgroundResource(R.drawable.tags_bg)
                        tagsLayout?.addView(tagTv)
                    }
                }
            }
        }

        @JvmStatic
        @BindingAdapter("visibility")
        fun checkVisibile(view: View, text: String) {
            view.visibility = if (text.isNullOrBlank()) View.GONE
            else View.VISIBLE
        }
    }
}

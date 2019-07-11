package com.saic.android.e.list.utils

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class SpaceItemDecoration : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.getItemOffsets(outRect, view, parent, state)
        var position = parent?.getChildAdapterPosition(view)
        if(position != 0) {
            outRect?.left = 30
            outRect?.right = 30
            outRect?.top = 30
        }
    }
}
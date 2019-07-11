package com.saic.android.e.list.model

data class HomeBean(var id: String) {
    var style = 0
    lateinit var tags: String

    lateinit var type: String

    lateinit var time: String

    lateinit var startPosition: String

    lateinit var endPosition: String

    lateinit var note: String

    lateinit var state: String

}
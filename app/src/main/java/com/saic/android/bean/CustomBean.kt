package com.saic.android.bean

import android.util.Log

class CustomBean(var name:String){
    var ll = "this name = $name".also(::println)
    init {
        Log.i("ivy","this Name is $name")
    }

    constructor(name :String,age : Int) : this(name) {
        print("name = $name,age = $age")
    }

    var address : String = "abc"
        private set

    lateinit var street : String
}

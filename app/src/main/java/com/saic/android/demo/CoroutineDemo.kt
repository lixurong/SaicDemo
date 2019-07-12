package com.saic.android.demo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineDemo{
    fun main(){
        GlobalScope.launch {
            print("World~~!")
            delay(1000L)
            print("World!")
        }
        println("Hello ")
    }
}
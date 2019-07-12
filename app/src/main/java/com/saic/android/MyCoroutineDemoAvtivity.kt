package com.saic.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import kotlinx.coroutines.*
import kotlin.concurrent.thread

@Route(path="/coroutine/demo")
class MyCoroutineDemoAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        test5()
    }

    fun test(){
        println("Hello~~ ")
        GlobalScope.launch {
            delay(1000L)
            Log.i("ivy","World!!!"+Thread.currentThread().name)
        }
        Log.i("ivy","World!!!"+Thread.currentThread().name)
//        Thread.sleep(2000L)
    }

    fun test2(){
        runBlocking {
            var job = GlobalScope.launch {
                delay(1000L)
                Log.i("ivy", "World!!!")
            }
            Log.i("ivy", "Hello ")
            job.join()
        }
        Log.i("ivy", "开始主程序 ")
    }

    fun test3(){
        runBlocking {
           launch {
                delay(1000L)
               Log.i("ivy","World3")
            }
            Log.i("ivy", "Hello3 ")
        }
    }

    fun test4(){
        runBlocking {
            coroutineScope {
                launch {
                    delay(1000L)
                    Log.i("ivy", "World3")
                }
                Log.i("ivy", "Hello3 ")
            }
        }
    }

    fun test5(){
        runBlocking {
            val startTime = System.currentTimeMillis()
            val job = launch(Dispatchers.Default) {
                var nextPrintTime = startTime
                var i = 0
                while (i < 5) { // 一个执行计算的循环，只是为了占用 CPU
                    // 每秒打印消息两次
                    if (System.currentTimeMillis() >= nextPrintTime) {
                        println("job: I'm sleeping ${i++} ...")
                        nextPrintTime += 500L
                    }
                }
            }
            delay(1300L) // 等待一段时间
            println("main: I'm tired of waiting!")
            job.cancelAndJoin() // 取消一个作业并且等待它结束
            println("main: Now I can quit.")
        }
    }
}
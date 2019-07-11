package com.saic.android.util


import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Function
import java.util.concurrent.TimeUnit


object RxCountDown {

    fun countdown(time: Int): Observable<Int> {
        var time = if (time < 0) 0
        else time

        val countTime = time
        return Observable.interval(0, 1, TimeUnit.SECONDS)
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(object : Function<Long, Int> {
                    override fun apply(t: Long): Int {
                        return countTime - t?.toInt()
                    }
                })
                .take((countTime + 1).toLong())

    }
}
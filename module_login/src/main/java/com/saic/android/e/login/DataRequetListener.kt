package com.saic.android.e.login

interface DataRequetListener{
    fun onSuccess(response : String)
    fun onFailure(error : String)
}
package com.saic.android.e.list.model

import android.os.Parcel
import android.os.Parcelable

class HomeBean() : Parcelable{
    var style = 0

    lateinit var tags : String

    lateinit var type : String

    lateinit var time : String

    lateinit var startPosition : String

    lateinit var endPosition : String

    lateinit var note : String

    lateinit var state : String

    constructor(parcel: Parcel) : this() {
        style = parcel.readInt()
        tags = parcel.readString()
        type = parcel.readString()
        time = parcel.readString()
        startPosition = parcel.readString()
        endPosition = parcel.readString()
        note = parcel.readString()
        state = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(style)
        parcel.writeString(tags)
        parcel.writeString(type)
        parcel.writeString(time)
        parcel.writeString(startPosition)
        parcel.writeString(endPosition)
        parcel.writeString(note)
        parcel.writeString(state)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HomeBean> {
        override fun createFromParcel(parcel: Parcel): HomeBean {
            return HomeBean(parcel)
        }

        override fun newArray(size: Int): Array<HomeBean?> {
            return arrayOfNulls(size)
        }
    }


}
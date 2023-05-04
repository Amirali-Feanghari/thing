package com.example.tesla

import android.os.Parcel
import android.os.Parcelable

data  class Oard(var name:String , val  image :Int) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Oard> {
        override fun createFromParcel(parcel: Parcel): Oard {
            return Oard(parcel)
        }

        override fun newArray(size: Int): Array<Oard?> {
            return arrayOfNulls(size)
        }
    }
}


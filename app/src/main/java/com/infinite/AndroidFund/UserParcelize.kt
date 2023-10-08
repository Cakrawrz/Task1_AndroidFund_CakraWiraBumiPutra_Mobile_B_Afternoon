package com.infinite.AndroidFund

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserParcelize(
    val username:String,
    val password:String
):Parcelable

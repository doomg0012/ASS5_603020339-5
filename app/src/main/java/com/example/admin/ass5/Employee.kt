package com.example.admin.ass5

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee (val name: String, val gender: String, val mail: String, val salary: Int):Parcelable{
}
package com.example.bharatd.geofencingexample.model

import java.util.*

/**
 * Created by BharatD on 20-09-2018.
 */
data class Group(val name: String, val createdDate: Date ,val updatedDate:Date,val member:List<User>,val gruopId:Int)

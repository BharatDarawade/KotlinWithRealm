package com.example.bharatd.expenses.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

/**
 * Created by BharatD on 26-09-2018.
 */
open class Person() : RealmObject() {
@PrimaryKey
var id:Long=0;
var name:String?=null
var dob:Date?=null
var groupName:String?=null

}
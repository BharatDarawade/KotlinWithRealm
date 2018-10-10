/*
package com.example.bharatd.expenses.interfaces

import io.realm.Realm
import java.lang.reflect.Member

*/
/**
 * Created by BharatD on 22-09-2018.
 *//*

class  MemberService :MemberInterface {
    override fun addMember(realm: Realm, member: Member): Boolean {
        try {
            realm.beginTransaction()
            realm.copyToRealm(member)
            realm.commitTransaction()
            return true
        } catch (e: Exception) {
            println(e)
            return false
        }

    }

    override fun delMember(realm: Realm, _ID: Int): Boolean {

        try {
            realm.beginTransaction()
            realm.where(Member :: class.java).equalTo("_ID", _ID).findFirst().removeFromRealm()
            realm.commitTransaction()
            return true
        } catch (e: Exception) {
            println(e)
            return false
        }




    }

    override fun editMember(realm: Realm, member: Member): Boolean {
        try {
            realm.beginTransaction()
            realm.copyToRealm(member)
            realm.commitTransaction()
            return true
        } catch (e: Exception) {
            println(e)
            return false
        }    }

    override fun getMember(realm: Realm, MemberId: Int): Member {
        return realm.where(Member::class.java).equalTo("_ID", MemberId).findFirst()
    }

    override fun removeLastMember(realm: Realm) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}*/

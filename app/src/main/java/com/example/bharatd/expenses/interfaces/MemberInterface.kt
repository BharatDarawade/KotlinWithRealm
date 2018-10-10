package com.example.bharatd.expenses.interfaces

import io.realm.Realm
import java.lang.reflect.Member

/**
 * Created by BharatD on 22-09-2018.
 */
interface MemberInterface {
    fun addMember(realm: Realm, member: Member): Boolean
    fun delMember(realm: Realm, _ID: Int): Boolean
    fun editMember(realm: Realm, member: Member): Boolean
    fun getMember(realm: Realm, MemberId: Int): Member
    fun removeLastMember(realm: Realm)
}

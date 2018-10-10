package com.example.bharatd.expenses

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.bharatd.expenses.model.Person
import com.example.bharatd.geofencingexample.adapters.CustomMemberAdapter
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_members.*
import kotlinx.android.synthetic.main.fragment_members.view.*
import java.util.*

/**
 * Created by BharatD on 23-09-2018.
 */
public class MemberFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var view=inflater.inflate(R.layout.fragment_members, container, false)


        Realm.init(context)

        val config= RealmConfiguration.Builder().name("membera").build()
        val realm= Realm.getInstance(config)
        /*val memberToAdd=realm.createObject(Person::class.java,2)
        memberToAdd.name="bharat"
        memberToAdd.dob=Date()
        memberToAdd.groupName="NeMO"
        realm.commitTransaction()
*/
        val allMembers=        realm.where(Person::class.java).findAll()
        allMembers.forEach({
            Log.e("GP Name",it.groupName)
            Log.e(" Name",it.name)
        })










    view.memberList.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user

        //adding some dummy data to the list

        //creating our adapter
        val adapter = CustomMemberAdapter(allMembers, context!!)

        //now adding the adapter to recyclerview
       view.memberList.adapter = adapter






        return view
    }

}
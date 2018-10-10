package com.example.bharatd.geofencingexample.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.bharatd.expenses.R
import com.example.bharatd.expenses.model.Person
import io.realm.RealmResults

/**
 * Created by BharatD on 20-09-2018.
 */
class CustomMemberAdapter(val groupList: RealmResults<Person>, val context:Context) : RecyclerView.Adapter<CustomMemberAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomMemberAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_member_layout, parent, false)
        return ViewHolder(v,context)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomMemberAdapter.ViewHolder, position: Int) {
        holder.bindItems(groupList[position]!!)
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return groupList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(group: Person) {
            val textViewName = itemView.findViewById(R.id.name) as TextView
            textViewName.text = group.name


        }
    }
}

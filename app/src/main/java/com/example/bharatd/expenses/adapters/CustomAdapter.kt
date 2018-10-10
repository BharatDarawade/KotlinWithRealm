package com.example.bharatd.geofencingexample.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.example.bharatd.expenses.GroupDetailsActivity
import com.example.bharatd.expenses.R
import com.example.bharatd.geofencingexample.model.Group

/**
 * Created by BharatD on 20-09-2018.
 */
class CustomAdapter(val groupList: ArrayList<Group>,val context:Context) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v,context)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(groupList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return groupList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(group: Group) {
            val textViewName = itemView.findViewById(R.id.textViewGrouprName) as TextView
            val detailsBtn  = itemView.findViewById(R.id.details) as ImageButton
            textViewName.text = group.name

            detailsBtn.setOnClickListener(View.OnClickListener {
                Toast.makeText(context,"Button Clicked",Toast.LENGTH_LONG).show()

                val intent= Intent(context,GroupDetailsActivity::class.java)
                context.startActivity(intent)
            })
        }
    }
}

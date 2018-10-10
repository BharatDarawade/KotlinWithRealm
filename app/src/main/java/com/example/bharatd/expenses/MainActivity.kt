package com.example.bharatd.expenses

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import com.example.bharatd.geofencingexample.adapters.CustomAdapter
import com.example.bharatd.geofencingexample.model.Group
import com.example.bharatd.geofencingexample.model.User
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

   /* private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
               // message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
               // message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
              //  message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)



        //adding a layoutmanager
        groupList.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val groups = ArrayList<Group>()

        //adding some dummy data to the list
        groups.add(Group("Nemo", Date() , Date(), ArrayList<User>(),1))

        //creating our adapter
        val adapter = CustomAdapter(groups,this)

        //now adding the adapter to recyclerview
        groupList.adapter = adapter

        add.setOnClickListener(View.OnClickListener {
        })

    }
}

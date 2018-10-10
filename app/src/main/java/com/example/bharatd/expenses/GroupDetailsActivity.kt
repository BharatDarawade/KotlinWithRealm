package com.example.bharatd.expenses

import android.app.AlertDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText

import kotlinx.android.synthetic.main.activity_group_details.*

class GroupDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_details)
        setSupportActionBar(toolbar)

              val members = findViewById<Button>(R.id.members)

        members.setOnClickListener(View.OnClickListener {
            val fragment = MemberFragment()
            supportFragmentManager.beginTransaction().replace(R.id.mainLayout,fragment).commit()

        })
       fab.setOnClickListener { view ->

            val context = this
            val builder = AlertDialog.Builder(context)
            builder.setTitle("New Member")

           

            // https://stackoverflow.com/questions/10695103/creating-custom-alertdialog-what-is-the-root-view
            // Seems ok to inflate view with null rootView
            val view = layoutInflater.inflate(R.layout.dialog_new_category, null)

            val categoryEditText = view.findViewById(R.id.nameEditText) as EditText

            builder.setView(view);

            // set up the ok button
            builder.setPositiveButton(android.R.string.ok) { dialog, p1 ->
                val newCategory = categoryEditText.text
                var isValid = true
                if (newCategory.isBlank()) {
                    categoryEditText.error = "Empty note"
                    isValid = false
                }

                if (isValid) {
                    // do something
                }

                if (isValid) {
                    dialog.dismiss()
                }
            }

            builder.setNegativeButton(android.R.string.cancel) { dialog, p1 ->
                dialog.cancel()
            }


            builder.show();


        }
    }

}

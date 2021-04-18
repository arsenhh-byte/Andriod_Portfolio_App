

package com.example.arsenportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Home : AppCompatActivity() {



    lateinit var textname: TextView
    lateinit var btnAbout: Button
    lateinit var btnContactUs: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)
        // reference the button to give it an action
        btnAbout = findViewById(R.id.about)
        btnContactUs= findViewById(R.id.contact)


        btnAbout.setOnClickListener(View.OnClickListener {

            val intentrelative = Intent(this,About::class.java)
            startActivity(intentrelative)
        })



        btnContactUs.setOnClickListener(View.OnClickListener {

            val intentconstraint = Intent(this,ContactUs::class.java)
            startActivity(intentconstraint)
        })


    }
}
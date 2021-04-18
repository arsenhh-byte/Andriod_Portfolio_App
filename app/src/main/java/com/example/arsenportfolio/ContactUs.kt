package com.example.arsenportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout

class ContactUs : AppCompatActivity() {

    lateinit var btnClick: Button
    lateinit var btnToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)
        btnToast= findViewById(R.id.button)



        // set on click listener
        btnToast.setOnClickListener(View.OnClickListener {
            // This is how you do a toast
            Toast.makeText(this, "Arsen Hendricks",Toast.LENGTH_LONG).show()

        })

    }
}
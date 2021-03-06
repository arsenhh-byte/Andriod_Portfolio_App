package com.example.arsenportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    //initialize the variable to tag the DrawerLayout Class
    private lateinit var drawer: DrawerLayout
    private lateinit var toolbar: Toolbar  //toolbar
    private lateinit var navView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)

        drawer = findViewById(R.id.nav_drawer)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        navView = findViewById(R.id.nav_drawer)
        //giving nav view a listener
        navView.setNavigationItemSelectedListener(this)

        //new instance of the ActionBarToggle class so that we can get the hamburger icon
        val toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(
            this, drawer, toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        //attach a drawer listener for the toggle effect
        drawer.addDrawerListener(toggle)
        //sync state
        toggle.syncState()

    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            //what happens when relative is clicked
            R.id.nav_homepage ->{
                val intentRelative= Intent(this@NavigationDrawerActivity,Home::class.java)
                startActivity(intentRelative)
            }

            //what happens when linear is clicked
            R.id.nav_contactus ->{

                val intentLinear= Intent(this@NavigationDrawerActivity,ContactUs::class.java)
                startActivity(intentLinear)
            }


            //what happens when constraint is clicked
            R.id.nav_about ->{
                val intentConstraint= Intent(this@NavigationDrawerActivity,About::class.java)
                startActivity(intentConstraint)
            }



        }
        return true
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }


}
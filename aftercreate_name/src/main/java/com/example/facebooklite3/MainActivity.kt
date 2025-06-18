package com.example.facebooklite3

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import com.example.facebooklite3.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var join:TextView
    private lateinit var line:View
    private lateinit var i:ImageView
    private lateinit var t1:TextView
    private lateinit var t2:TextView
    private lateinit var t3:TextView
    private lateinit var e1:EditText
    private lateinit var t4:TextView
    private lateinit var e2:EditText
    private lateinit var b1:Button
    private lateinit var b2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setClicks()
        }
    private fun setClicks() {
    elementsBinding()
    b1.setOnClickListener(View.OnClickListener {
    // Code for task when button 1 click
        Toast.makeText(applicationContext, "Proceeding to next", Toast.LENGTH_LONG).show()
    })
    b2.setOnClickListener(View.OnClickListener {
    //Code for task when button 2 click
        Toast.makeText(applicationContext,"Loading to go back to Login Page",Toast.LENGTH_LONG).show()
    })
}
private fun elementsBinding() {
    join= findViewById(R.id.join)
    line=findViewById(R.id.line)
    i=findViewById(R.id.i)
    t1=findViewById(R.id.t1)
    t2=findViewById(R.id.t2)
    t3=findViewById(R.id.t3)
    e1=findViewById(R.id.e1)
    t4=findViewById(R.id.t4)
    e2=findViewById(R.id.e2)
}
}


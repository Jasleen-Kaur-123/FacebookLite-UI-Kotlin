package com.example.project1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class createDOB:AppCompatActivity(){
    private lateinit var b1: Button
    private lateinit var b2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_dob_xml)
        b2=findViewById(R.id.b2)
        b1=findViewById(R.id.b1)
        b1.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,creategender::class.java)
            startActivity(intent)
        })
        b2.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        })
    }
}
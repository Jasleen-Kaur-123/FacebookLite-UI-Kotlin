package com.example.project1
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
class creategender:AppCompatActivity(){
    private lateinit var b1:Button
    private lateinit var b2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_gender_xml)
        b2=findViewById(R.id.b2)
        b1=findViewById(R.id.b1)
        b1.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,createpassword::class.java)
            startActivity(intent)
        })
        b2.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        })
    }
}
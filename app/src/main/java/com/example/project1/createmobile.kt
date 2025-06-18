package com.example.project1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
class createmobile:AppCompatActivity(){
    private lateinit var b1:Button
    private lateinit var already:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_mobile_xml)
        b1=findViewById(R.id.b1)
        already=findViewById(R.id.already)
        b1.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,createDOB::class.java)
            startActivity(intent)
        })
        already.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        })
    }
}
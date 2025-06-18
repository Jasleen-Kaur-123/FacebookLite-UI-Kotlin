package com.example.project1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class MainActivity : AppCompatActivity(){
    private lateinit var marqueeText:TextView
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        marqueeText=findViewById(R.id.marqueeText)
        marqueeText.isSelected = true
    }
 }

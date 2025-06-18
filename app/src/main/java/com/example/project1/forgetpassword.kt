package com.example.project1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
class forgetpassword:AppCompatActivity(){
    private lateinit var cancel:Button
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forget_password_activity)
        cancel=findViewById(R.id.cancel)
        cancel.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        })
    }
}
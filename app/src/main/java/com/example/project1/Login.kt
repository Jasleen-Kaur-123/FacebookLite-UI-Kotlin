package com.example.project1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
class Login : AppCompatActivity(){
    private lateinit var name:EditText
    private lateinit var pass:EditText
    private lateinit var bn1:Button
    private lateinit var forget:TextView
    private lateinit var bn2:Button
    private lateinit var dialog: AlertDialog.Builder
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_xml)
        setClick()
    }
    private fun setClick(){
        binding()
        bn1.setOnClickListener(View.OnClickListener {
            //code execute when bn1(Log in) will be  click button
            if(name.text.toString().isEmpty()){
                dialog.setMessage("To log in, enter the mobile number or email address and password that you use for Facebook.").setCancelable(true)
                val alert:AlertDialog=dialog.create()
                alert.setTitle("Please enter your login info")
                alert.show()
            }
            else if(pass.text.toString().isEmpty()){
                dialog.setMessage("To log in, enter you password.").setCancelable(true)
                val alert:AlertDialog=dialog.create()
                alert.setTitle("Please enter your login info")
                alert.show()
            }
            else{
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        })
        forget.setOnClickListener(View.OnClickListener {
            //code execute when forget will be clicked
            val intent=Intent(this,forgetpassword::class.java)
            startActivity(intent)
        })
        bn2.setOnClickListener(View.OnClickListener {
            //code execute when create new account will be clicked
            val intent=Intent(this,createnewaccount::class.java)
            startActivity(intent)
        })
    }
    private fun binding(){
        name=findViewById(R.id.mobileandemail)
        pass=findViewById(R.id.password)
        bn1=findViewById(R.id.bn1)
        forget=findViewById(R.id.forget)
        bn2=findViewById(R.id.bn2)
        dialog = AlertDialog.Builder(this)
    }
}
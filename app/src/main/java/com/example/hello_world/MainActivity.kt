package com.example.hello_world

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

 lateinit var lname : EditText
 //lateinit var passwd : EditText
 lateinit var sname :TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lname =findViewById(R.id.login_name)
        sname=findViewById(R.id.wmsg)

    }
    fun test (fno:Int,lno:Int):Int{
        return fno+lno

    }

    fun welcome(view: View) {
        var alpha=test(10,20)-20
        sname.setText("Messi" + alpha)
        var gname = lname.text.toString()
        var homeactivity :Intent = Intent(this,login_success::class.java)
        homeactivity.putExtra("loname",gname)
        startActivity(homeactivity)



    }

}
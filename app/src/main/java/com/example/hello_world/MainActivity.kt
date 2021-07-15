package com.example.hello_world

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

        var gname = lname.text.toString()
        var alpha=test(10,20)
        sname.setText(""+alpha)

        Toast.makeText(this, "welcome $gname ", Toast.LENGTH_SHORT).show()

    }

}
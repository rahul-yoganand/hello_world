package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

lateinit var tvDataReceived: TextView

class login_success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tvDataReceived=findViewById(R.id.textView)
        setContentView(R.layout.activity_login_success)
        var gnameRe = intent.getStringExtra("loname")
        tvDataReceived.setText(gnameRe)



        Toast.makeText(this, "welcome to android Mr. $gnameRe ", Toast.LENGTH_SHORT).show()
    }
}
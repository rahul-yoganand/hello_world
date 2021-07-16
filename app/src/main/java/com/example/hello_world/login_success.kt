package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class login_success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_success)
        var gnameRe = intent.getStringExtra("loname")



        Toast.makeText(this, "welcome to android Mr. $gnameRe ", Toast.LENGTH_SHORT).show()
    }
}
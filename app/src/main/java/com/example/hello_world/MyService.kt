package com.example.hello_world

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

class MyService : Service() {

    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this,"Service Created",Toast.LENGTH_SHORT).show()
    }

//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        return super.onStartCommand(intent, flags, startId)
//    }
    override fun onBind(intent: Intent): IBinder? {
        return null
   }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"Service Destroyed",Toast.LENGTH_SHORT).show()
    }
}
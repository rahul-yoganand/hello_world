package com.example.hello_world

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class smsReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"yoganand u 've an sms",Toast.LENGTH_SHORT).show()
    }

}
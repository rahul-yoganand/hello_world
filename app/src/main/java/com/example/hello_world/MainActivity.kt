package com.example.hello_world

import android.content.ContentValues.TAG
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CalendarContract
import android.util.Log
import android.view.View
import android.widget.Button
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
        lname = findViewById(R.id.login_name)
        sname = findViewById(R.id.wmsg)

    }

    fun test(fno: Int, lno: Int): Int {
        return fno + lno

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"on start -- activity started")
    }

    var login_button : Button =findViewById(R.id.button)


    fun welcome(view: View) {
        var alpha = test(10, 20) - 20
        sname.setText("G.O.A.TMessi" + alpha)


        when (view.id) {

            R.id.button -> {
                var gname = lname.text.toString()
                var homeactivity: Intent = Intent(this, login_success::class.java)
                homeactivity.putExtra("loname", gname)
                startActivity(homeactivity)
            }

            R.id.button2 -> {
                val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                    putExtra(AlarmClock.EXTRA_MESSAGE, "wake up yoga")
                    putExtra(AlarmClock.EXTRA_HOUR, 16)
                    putExtra(AlarmClock.EXTRA_MINUTES, 0)
                }
                startActivity(intent)

            }

            R.id.googleButton -> {
                var gIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
                startActivity(gIntent)

            }

            R.id.dialButton -> {

                var dIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:1234567890"))
                startActivity(dIntent)
            }

            R.id.calButton -> {
                var resintent = Intent(this, login_success::class.java)
                startActivityForResult(resintent, 123)

            }


        }

    }

}

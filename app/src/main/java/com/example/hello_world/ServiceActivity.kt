package com.example.hello_world

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.View
import android.widget.Toast

class ServiceActivity : AppCompatActivity() {
    var TAG = ServiceActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

    }

    private var serviceConnection = object : ServiceConnection {
        override fun onServiceConnected(p0: ComponentName?, binderPipe: IBinder?) { //4
            var localBinder = binderPipe as LocalBinder//5
            //var localService = LocalService()
            var localService = localBinder.getLocalService()
            var sum = localService.add(10, 20)
           Toast.makeText(this@ServiceActivity,"$sum",Toast.LENGTH_LONG).show()
        }

        override fun onServiceDisconnected(name: ComponentName?) {
        }
    }

    private fun bindToaService() {
        var intent = Intent(this, LocalService::class.java)
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE)
    }

    fun handleServices(view: View) {
        when (view.id) {

            R.id.btnStart -> {
                var serviceIntent = Intent(this, MyService::class.java)
                startService(serviceIntent)
            }
            R.id.btnStop -> {
                var serviceIntent = Intent(this, MyService::class.java)
                stopService(serviceIntent)

            }
            R.id.btnBind -> {
                bindToaService()
            }
        }


    }
}
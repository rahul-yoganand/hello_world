package  com.example.hello_world

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class LocalService: Service() {

    private val binderPipe = LocalBinder()

    public fun add(a: Int, b: Int):Int {
        return a+b
    }

    override fun onBind(p0: Intent?): IBinder? {
        return binderPipe
    }
}

class LocalBinder : Binder(){
    fun getLocalService(): LocalService{
        return  LocalService()
    }

}
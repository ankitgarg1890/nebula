package com.example.myapplication

import android.R
import android.app.*
import android.app.PendingIntent.FLAG_IMMUTABLE
import android.app.PendingIntent.FLAG_MUTABLE
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ContentInfoCompat


class MyService:Service() {


    override fun onBind(p0: Intent?): IBinder? {
        Log.d("MyService", "onBind ")
        return null
    }
    override fun onCreate() {

        Log.d("MyService", "onCreate ")


        super.onCreate()
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.d("MyService", "onStartCommand ")

        /*val intent = Intent(this, MainActivity::class.java)

        val pendingIntent = PendingIntent.getActivity(this, 0, intent, FLAG_IMMUTABLE)

        val notification: Notification = NotificationCompat.Builder(this, "CHANNEL_ID")
            .setContentTitle("Example Service")
            .setContentText("Input")
            .setSmallIcon(R.drawable.ic_notification_overlay)
            .setContentIntent(pendingIntent)
            .build()

        startForeground(1, notification)

        createNotificationChannel1()

        return START_NOT_STICKY*/




      return super.onStartCommand(intent, flags, startId)



    }

   /* private fun createNotificationChannel1() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(
                "CHANNEL_ID",
                "Example Service Channel",
                NotificationManager.IMPORTANCE_DEFAULT
            )

            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(serviceChannel)
        }
    }*/


    override fun onDestroy() {

        Log.d("MyService", "onDestroy ")


        //stopForeground(true)
       // stopSelf()
        super.onDestroy()
    }

}
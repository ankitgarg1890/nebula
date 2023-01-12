package com.example.myapplication

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    lateinit var startbutton: Button
    lateinit var stopbutton: Button
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        startbutton = findViewById(R.id.bt_start)

        stopbutton = findViewById(R.id.bt_stop)


        startbutton.setOnClickListener{


            val serviceIntent = Intent(this, MyService::class.java)

           // startForegroundService(serviceIntent)
            startService(serviceIntent)

           // startService(Intent(this,MyService::class.java))




        }



        stopbutton.setOnClickListener{

            stopService(Intent(this,MyService::class.java))

        }
    }
}
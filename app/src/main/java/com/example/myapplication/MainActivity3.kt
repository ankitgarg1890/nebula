package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity3 : AppCompatActivity() {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        button = findViewById(R.id.bt_frag)



        button.setOnClickListener {

            val manager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = manager.beginTransaction()

            transaction.add(R.id.container_life, Fragment_lifecycle())
            transaction.addToBackStack("")
        transaction.commit()

            /* supportFragmentManager.beginTransaction().replace(R.id.container_life,Fragment_lifecycle()).commit()*/
        }



        Log.d("Activity_lifecycle", "onCreate ")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()

        Log.d("Activity_lifecycle", "onStart ")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity_lifecycle", "onResume ")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity_lifecycle", "onPause ")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity_lifecycle", "onStop ")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity_lifecycle", "onDestroy ")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}
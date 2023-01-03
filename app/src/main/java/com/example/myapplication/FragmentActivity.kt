package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.viewmodel.viewModelFactory

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
     /*   supportFragmentManager.beginTransaction().add(R.id.container,Fragmentone()).commitAllowingStateLoss()
        supportFragmentManager.beginTransaction().add(R.id.container1, Fragment_two()).commitAllowingStateLoss()*/

    }

    override fun onResume() {
        super.onResume()
        Log.d("onresumeeee", "onResumesdfsfsf ")
    }


}
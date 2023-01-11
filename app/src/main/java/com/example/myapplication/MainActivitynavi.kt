package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivitynavi : AppCompatActivity() {
lateinit var buttona: Button
    lateinit var buttonb: Button
    lateinit var buttonc: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitynavi)


        buttona = findViewById(R.id.frg_A)

        buttonb = findViewById(R.id.frg_B)

        buttonc = findViewById(R.id.frg_C)




        buttona.setOnClickListener {

            val manager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = manager.beginTransaction()

            transaction.replace(R.id.container_frag, Fragment_A())
            transaction.addToBackStack("")
            transaction.commit()

        }

        buttonb.setOnClickListener {

            val manager: FragmentManager = supportFragmentManager
            val transaction: FragmentTransaction = manager.beginTransaction()

            transaction.replace(R.id.container_frag, Fragment_B())
            transaction.addToBackStack("")
            transaction.commitAllowingStateLoss()

        }

        supportFragmentManager.addOnBackStackChangedListener {

            val entryCount=supportFragmentManager.backStackEntryCount

            Toast.makeText(this@MainActivitynavi,"Stack changed"+entryCount.toString(),Toast.LENGTH_SHORT).show()

        }
        buttonc.setOnClickListener {

            val manager: FragmentManager = supportFragmentManager

            val transaction: FragmentTransaction = manager.beginTransaction()

            transaction.replace(R.id.container_frag,Fragment_C())
            transaction.addToBackStack("")
            transaction.commit()

           /* FragmentManager.OnBackStackChangedListener {


            }*/

            val fragmentCount = supportFragmentManager.backStackEntryCount
            Log.d("FragmentStack", "Number of fragments in stack: $fragmentCount")



        }



    }



}
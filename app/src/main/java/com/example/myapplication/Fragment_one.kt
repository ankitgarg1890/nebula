package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.ViewModelFactoryDsl
import androidx.lifecycle.viewmodel.viewModelFactory


class Fragmentone : Fragment() {
 lateinit var rootView: View
 lateinit var textView: TextView
 lateinit var button: Button
    private var model: MyViewmodel? = null

    lateinit var context1:Context

    var count=0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (savedInstanceState != null) {

            count = savedInstanceState.getInt("Count")
            Toast.makeText(requireContext(),"Count value"+count,Toast.LENGTH_LONG).show()

        }

        // Inflate the layout for this fragment


        val View =  inflater.inflate(R.layout.fragment_fragmentone, container, false)
        textView = View.findViewById(R.id.txt_count)
        button = View.findViewById(R.id.bt_increases)

        model = ViewModelProvider(requireActivity())[MyViewmodel::class.java]


       /* model = activity?.run {
            ViewModelProvider(this).get(MyViewmodel::class.java)
        } ?: throw Exception("Invalid Activity")*/
        button.setOnClickListener {

            count++

            textView.text = ""+count

            model!!.setItem(count)


        }

        return View
    }



    override fun onSaveInstanceState(outState: Bundle) {

        outState.putInt("Count", count)
        super.onSaveInstanceState(outState)
    }

    }



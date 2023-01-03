package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider


class Fragment_two : Fragment() {
    lateinit var rootView: View
    lateinit var textView: TextView
    private var model: MyViewmodel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        val View =  inflater.inflate(R.layout.fragment_two, container, false)

        textView  = View.findViewById(R.id.count_value)

        model = ViewModelProvider(requireActivity())[MyViewmodel::class.java]

        model = activity?.run {

            ViewModelProvider(this).get(MyViewmodel::class.java)

        } ?: throw Exception("Invalid Activity")

        model!!.getSelected().observe(requireActivity()) { item ->

            Log.d("itemsssssstwo", "onCreateView: "+item)

            textView.setText(""+item)

        }
        return View
    }


}
package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_lifecycle_b.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_lifecycle_b : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    lateinit var rootView: View

    lateinit var context1:Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment_lifecycle_2", "onAttach ")

        Toast.makeText(requireContext(), "onAttach_fragment 2", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

            Log.d("Fragment_lifecycle_2", "onCreateView ")
            Toast.makeText(requireContext(), "onCreateView_fragment 2", Toast.LENGTH_SHORT).show()



        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment




        Log.d("Fragment_lifecycle_2", "onCreateView ")


        Toast.makeText(requireContext(), "onCreateView_fragment 2", Toast.LENGTH_SHORT).show()


       val View =  inflater.inflate(R.layout.fragment_lifecycle_b, container, false)



        return View

        

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("Fragment_lifecycle_2", "onViewCreated ")
        Toast.makeText(requireContext(), "onViewCreated_fragment 2", Toast.LENGTH_SHORT).show()
    }
   /* override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment_lifecycle_2", "onActivityCreated ")
        Toast.makeText(requireContext(), "onActivityCreated_fragment 2", Toast.LENGTH_SHORT).show()

    }*/

    override fun onStart() {
        super.onStart()
        Log.d("Fragment_lifecycle_2", "onStart ")
        Toast.makeText(requireContext(), "onStart_fragment 2", Toast.LENGTH_SHORT).show()


    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment_lifecycle_2", "onResume ")
        Toast.makeText(requireContext(), "onResume_fragment 2", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment_lifecycle_2", "onPause ")
        Toast.makeText(requireContext(), "onPause_fragment 2", Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()

        Log.d("Fragment_lifecycle_2", "onStop ")
        Toast.makeText(requireContext(), "onStop_fragment 2", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment_lifecycle_2", "onDestroyView ")
        Toast.makeText(requireContext(), "onDestroyView_fragment 2", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment_lifecycle_2", "onDestroy ")
        Toast.makeText(requireContext(), "onDestroy_fragment 2", Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment_lifecycle_2", "onDetach ")
        Toast.makeText(requireContext(), "onDetach_fragment 2", Toast.LENGTH_SHORT).show()

    }






}
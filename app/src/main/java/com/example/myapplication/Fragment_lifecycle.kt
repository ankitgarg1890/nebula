package com.example.myapplication

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_lifecycle.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_lifecycle : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var button: Button
    lateinit var rootView: View



    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment_lifecycle", "onAttach ")
        Toast.makeText(requireContext(), "onAttach_fragment 1", Toast.LENGTH_SHORT).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

            Log.d("Fragment_lifecycle", "onCreate ")
            Toast.makeText(requireContext(), "onCreate_fragment 1", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        Log.d("Fragment_lifecycle", "onCreateView ")
        Toast.makeText(requireContext(), "onCreateView_fragment 1", Toast.LENGTH_SHORT).show()


       val View=  inflater.inflate(R.layout.fragment_lifecycle, container, false)

        button = View.findViewById(R.id.fag_bt)

        button.setOnClickListener {

            val manager: FragmentManager = requireActivity().supportFragmentManager
            val transaction: FragmentTransaction = manager.beginTransaction()

            transaction.add(R.id.container_life, Fragment_lifecycle_b(),"Fragment b")
            transaction.addToBackStack("")
            transaction.commit()

        }

        return View
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment_lifecycle", "onActivityCreated ")
        Toast.makeText(requireContext(), "onActivityCreated_fragment 1", Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment_lifecycle", "onStart ")
        Toast.makeText(requireContext(), "onStart_fragment 1", Toast.LENGTH_SHORT).show()


    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment_lifecycle", "onResume ")
        Toast.makeText(requireContext(), "onResume_fragment 1", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment_lifecycle", "onPause ")
        Toast.makeText(requireContext(), "onPause_fragment 1", Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()

        Log.d("Fragment_lifecycle", "onStop ")
        Toast.makeText(requireContext(), "onStop_fragment 1", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment_lifecycle", "onDestroyView ")
        Toast.makeText(requireContext(), "onDestroyView_fragment 1", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment_lifecycle", "onDestroy ")
        Toast.makeText(requireContext(), "onDestroy_fragment 1", Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment_lifecycle", "onDetach ")
        Toast.makeText(requireContext(), "onDetach_fragment 1", Toast.LENGTH_SHORT).show()

    }
}
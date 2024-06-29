package com.example.a3layoutcode.fragmnets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.a3layoutcode.R
import com.example.a3layoutcode.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {

    private lateinit var binding: FragmentBlank1Binding
    private lateinit var navController : NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
//        var view = inflater.inflate(R.layout.fragment_blank1, container, false)
//        return view
        binding= FragmentBlank1Binding.inflate(inflater,container,false)

        var temp =5

        binding.button5.setOnClickListener {
            if (temp==5){
                navController.navigate(R.id.action_blankFragment1_to_constraint_layoutActivity)
            }
            else{
                navController.navigate(R.id.action_blankFragment1_to_blankFragment2)
            }
        }

        return binding.root
    }

    companion object {
    }
}
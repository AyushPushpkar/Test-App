package com.example.a3layoutcode.fragmnets

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.a3layoutcode.FeaturesActivity
import com.example.a3layoutcode.MainActivity
import com.example.a3layoutcode.R
import com.example.a3layoutcode.databinding.FragmentBlank2Binding



class BlankFragment2 : Fragment() {

    private lateinit var binding: FragmentBlank2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentBlank2Binding.inflate(inflater,container,false)

        val button: Button = binding.button9

        button.setOnClickListener {
            val intent = Intent(requireActivity(), FeaturesActivity::class.java)
            startActivity(intent)
        }


        return binding.root

    }

    companion object {

    }
}
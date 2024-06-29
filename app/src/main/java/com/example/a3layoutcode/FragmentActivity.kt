package com.example.a3layoutcode

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import com.example.a3layoutcode.databinding.ActivityFragmentBinding
import com.example.a3layoutcode.fragmnets.BlankFragment1
import com.example.a3layoutcode.fragmnets.BlankFragment2
import com.example.a3layoutcode.fragmnets.SettingsFragment

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val binding by lazy {
            ActivityFragmentBinding.inflate(layoutInflater)
        }
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var manager = supportFragmentManager  //support of fm
        var tr = manager.beginTransaction() //start tr
        tr.replace(R.id.frameLayout,BlankFragment2())  // what tr
        tr.commit()  // tr permanent

        binding.button6.setOnClickListener{

            var manager = supportFragmentManager  //support of fm
            var tr = manager.beginTransaction() //start tr
            tr.replace(R.id.frameLayout,BlankFragment2()) // what tr
            tr.commit()  // tr permanent
            tr.addToBackStack(null)
        }

        binding.button7.setOnClickListener {

            var manager = supportFragmentManager  //support of fm
            var tr = manager.beginTransaction() //start tr
            tr.replace(R.id.frameLayout,SettingsFragment())  // what tr
            tr.commit()  // tr permanent
            tr.addToBackStack(null)
        }
    }
}
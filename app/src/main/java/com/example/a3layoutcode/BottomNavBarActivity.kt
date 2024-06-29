package com.example.a3layoutcode


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.a3layoutcode.databinding.ActivityBottomNavBarBinding
import com.example.a3layoutcode.fragmnets.BlankFragment2
import com.example.a3layoutcode.fragmnets.BlankFragment3

class BottomNavBarActivity : AppCompatActivity() {

    private val binding: ActivityBottomNavBarBinding by lazy {
        ActivityBottomNavBarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val firstFragment = BlankFragment2()
        val secFragment = BlankFragment3()

        setCurrentFragment(secFragment)

        binding.bottomBar.onTabSelected = {
            when (it.id) {
                R.id.tab_home -> setCurrentFragment(firstFragment)
                R.id.tab_alarm -> setCurrentFragment(secFragment)
                R.id.tab_bread -> setCurrentFragment(firstFragment)
                R.id.tab_cart -> setCurrentFragment(secFragment)
            }
        }

        binding.bottomBar.onTabReselected = {
            // Handle tab reselection if needed
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout2, fragment)
            commit()
        }

}
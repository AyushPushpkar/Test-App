package com.example.a3layoutcode

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a3layoutcode.databinding.ActivityCustomViewsBinding

class customViewsActivity : AppCompatActivity() {
    private lateinit var button: Button
    lateinit var binding : ActivityCustomViewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityCustomViewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var bottom =AnimationUtils.loadAnimation(this,R.anim.bottomdown)
        var fadein = AnimationUtils.loadAnimation(this,R.anim.fadein)

        binding.cardView2.animation = bottom

        var handler = Handler(Looper.getMainLooper())
        var runnable = Runnable {
            //fade in  for other layouts

            binding.cardView.animation = fadein
            binding.button4.animation = fadein
            binding.textView5.animation = fadein

        }

        handler.postDelayed(runnable,1000)

        button=findViewById(R.id.button4)
    }
}
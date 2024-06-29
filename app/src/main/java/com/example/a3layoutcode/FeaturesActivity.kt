package com.example.a3layoutcode

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a3layoutcode.databinding.ActivityFeaturesBinding
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat

class FeaturesActivity : AppCompatActivity() {

    private val binding : ActivityFeaturesBinding by lazy {
        ActivityFeaturesBinding.inflate(layoutInflater)
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

        binding.Recycler.setOnClickListener{
            intent = Intent(this,RecyclerviewActivity::class.java)
            startActivity(intent)
        }

        binding.lifecycle.setOnClickListener {
            intent = Intent(this,LifeCycleActivity::class.java)
            startActivity(intent)
        }

        binding.fragments.setOnClickListener {
            intent = Intent(this,FragmentActivity::class.java)
            startActivity(intent)
        }

        binding.nav.setOnClickListener {
            intent = Intent(this,BottomNavBarActivity::class.java)
            startActivity(intent)
        }

        binding.customviews.setOnClickListener {
            intent = Intent(this,customViewsActivity::class.java)
            startActivity(intent)
        }

        binding.fragments2.setOnClickListener {
            intent = Intent(this,FragmentActivity2::class.java)
            startActivity(intent)
        }

        binding.sploading.setOnClickListener {
            intent = Intent(this , SPloadingActivity::class.java)
            startActivity(intent)
        }

        binding.firestoreenter.setOnClickListener{
            intent = Intent(this , FirestoreActivity::class.java)
            startActivity(intent)
        }

        binding.fcmnotify.setOnClickListener{
            intent = Intent(this , FCMnotificationActivity::class.java)
            startActivity(intent)
        }


    }

}
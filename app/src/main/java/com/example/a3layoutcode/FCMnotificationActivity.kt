package com.example.a3layoutcode

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a3layoutcode.databinding.ActivityFcmnotificationBinding
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging

class FCMnotificationActivity : AppCompatActivity() {

    val binding : ActivityFcmnotificationBinding by lazy {
        ActivityFcmnotificationBinding.inflate(layoutInflater)
    }
    var dataString : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        if(intent != null){
            if(intent.hasExtra("key1")){
                for ( key in intent.extras!!.keySet()){

                    dataString += intent.extras!!.getString(key) + "\n"
                }
                binding.textView10.text = dataString
            }
        }

//        FirebaseMessaging.getInstance().token.addOnCompleteListener {
//            if(it.isSuccessful){
//                Log.d("mytag", it.result.toString())
//            }
//        }

    }

    private fun enableEdgeToEdge(){

        val window = window // Get the Activity's window

        WindowCompat.setDecorFitsSystemWindows(window, false) // Opt-out ofdefault system window insets handling

        // Get the WindowInsetsControllerCompat
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView) ?: return

        // Set the status bar color
        windowInsetsController.isAppearanceLightStatusBars = false // Set to true for light status bar icons
        window.statusBarColor = ContextCompat.getColor(this, R.color.StatusColor)
    }
}
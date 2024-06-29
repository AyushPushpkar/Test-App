package com.example.a3layoutcode

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LifeCycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_life_cycle)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("TAG","onCreate : i am running")
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Log.d("TAG","onStart : i am running")
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume : i am running")
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause : i am running")
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop : i am running")
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("TAG","onRestart : i am running")
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","onDestroy : i am running")
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show()
    }
}
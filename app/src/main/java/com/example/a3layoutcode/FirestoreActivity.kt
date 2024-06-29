package com.example.a3layoutcode

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a3layoutcode.databinding.ActivityFirestoreBinding
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class FirestoreActivity : AppCompatActivity() {

    private val binding : ActivityFirestoreBinding by lazy {
        ActivityFirestoreBinding.inflate(layoutInflater)
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

        val db = Firebase.firestore

        binding.adddatabtn.setOnClickListener{
            // add data
            val user = hashMapOf(
                "Name" to binding.fillname.text.toString(),
                "Password" to binding.fillpass.text.toString(),
            )

            // Add a new document with a generated ID
            db.collection("users")
                .add(user)
                .addOnSuccessListener { documentReference ->
                    Toast.makeText(this, "DocumentSnapshot added with ID: ${documentReference.id}", Toast.LENGTH_LONG).show()
                }
                .addOnFailureListener { e ->
                    Toast.makeText(this, "Error : ${e.localizedMessage}", Toast.LENGTH_LONG).show()
                }
        }

    }
}
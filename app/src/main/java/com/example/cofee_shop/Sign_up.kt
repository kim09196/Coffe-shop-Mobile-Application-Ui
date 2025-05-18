package com.example.cofee_shop

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Sign_up : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        //val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())//
        // val.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        //insets//

        val signup: TextView = findViewById(R.id.btnsubmit)
        signup.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }



        }
    }

package com.example.cofee_shop

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val login: TextView = findViewById(R.id.btnsubmit)
        login.setOnClickListener {
            val intent = Intent(this, category::class.java)
            startActivity(intent)
        }

            val createAccount: TextView = findViewById(R.id.txtDnt_have_acc)
            createAccount.setOnClickListener {
                val intent = Intent(this, Sign_up::class.java)
                startActivity(intent)
            }

        }
    }

package com.example.cofee_shop

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class payment_confirmation : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment_confirmation)
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
         //   val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
           // v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            //insets


        val confirm: Button = findViewById(R.id.btnContinou)
        confirm.setOnClickListener {
            val intent = Intent(this, category::class.java)
            startActivity(intent)
        }
        val imgCart: ImageView = findViewById(R.id.cartIcon1)
        imgCart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
        val navMenu: ImageView = findViewById(R.id.Menuicon1)
        navMenu.setOnClickListener {
            val intent = Intent(this, menu::class.java)
            startActivity(intent)

        }
        val navHome: ImageView = findViewById(R.id.naveHome)
        navHome.setOnClickListener {
            val intent = Intent(this, category::class.java)
            startActivity(intent)
        }
    }
}


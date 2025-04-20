package com.example.madexam2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class phone : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_phone)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

//        val bac_add_btn: ImageView = findViewById(R.id.bac_add_btn)
//        bac_add_btn.setOnClickListener {
//            val intent = Intent(this, login::class.java)
//            startActivity(intent)
//        }

        val pho_btn: View? = findViewById(R.id.button7)
        pho_btn?.setOnClickListener {
            val intent = Intent(this, veriify::class.java)
            startActivity(intent)

        }

    }

}


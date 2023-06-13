package com.example.activitylaunchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn1_Main: Button = findViewById(R.id.btn1_Main)
        val btn2_Main: Button = findViewById(R.id.btn2_Main)
        val btn3_Main: Button = findViewById(R.id.btn3_Main)
        val btn4_Main: Button = findViewById(R.id.btn4_Main)

        btn1_Main.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        btn2_Main.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
        btn3_Main.setOnClickListener {
            val intent = Intent(this, Activity_C::class.java)
            startActivity(intent)
        }
        btn4_Main.setOnClickListener {
            val intent = Intent(this, Activity_D::class.java)
            startActivity(intent)
        }
    }


    }
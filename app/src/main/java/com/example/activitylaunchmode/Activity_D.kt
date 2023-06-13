package com.example.activitylaunchmode

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Activity_D:MainActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)

        val btn1_activityD: Button = findViewById(R.id.btn1_D)
        val btn2_activityD: Button = findViewById(R.id.btn2_D)
        val btn3_activityD: Button = findViewById(R.id.btn3_D)
        val btn4_activityD: Button = findViewById(R.id.btn4_D)

        btn1_activityD.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        btn2_activityD.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
        btn3_activityD.setOnClickListener {
            val intent = Intent(this, Activity_C::class.java)
            startActivity(intent)
        }
        btn4_activityD.setOnClickListener {
            val intent = Intent(this, Activity_D::class.java)
            startActivity(intent)
        }
    }
}
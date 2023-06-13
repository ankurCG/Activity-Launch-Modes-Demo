package com.example.activitylaunchmode

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Activity_C:MainActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val btn1_activityC: Button = findViewById(R.id.btn1_C)
        val btn2_activityC: Button = findViewById(R.id.btn2_C)
        val btn3_activityC: Button = findViewById(R.id.btn3_C)
        val btn4_activityC: Button = findViewById(R.id.btn4_C)

        btn1_activityC.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        btn2_activityC.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
        btn3_activityC.setOnClickListener {
            val intent = Intent(this, Activity_C::class.java)
            startActivity(intent)
        }
        btn4_activityC.setOnClickListener {
            val intent = Intent(this, Activity_D::class.java)
            startActivity(intent)
        }
    }
}
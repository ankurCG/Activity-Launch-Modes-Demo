package com.example.activitylaunchmode

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : MainActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val btn1_activityB: Button = findViewById(R.id.btn1_B)
        val btn2_activityB: Button = findViewById(R.id.btn2_B)
        val btn3_activityB: Button = findViewById(R.id.btn3_B)
        val btn4_activityB: Button = findViewById(R.id.btn4_B)

        btn1_activityB.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }
        btn2_activityB.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
        btn3_activityB.setOnClickListener {
            val intent = Intent(this, Activity_C::class.java)
            startActivity(intent)
        }
        btn4_activityB.setOnClickListener {
            val intent = Intent(this, Activity_D::class.java)
            startActivity(intent)
        }
    }
}
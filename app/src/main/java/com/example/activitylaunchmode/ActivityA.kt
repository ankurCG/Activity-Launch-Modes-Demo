package com.example.activitylaunchmode

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : MainActivity(){

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        val btn1_activityA : Button = findViewById(R.id.btn1_A)
        val btn2_activityA :Button = findViewById(R.id.btn2_A)
        val btn3_activityA :Button = findViewById(R.id.btn3_A)
        val btn4_activityA :Button = findViewById(R.id.btn4_A)

        btn1_activityA.setOnClickListener {
            val intent =Intent(this,ActivityA::class.java)
            startActivity(intent)
        }
        btn2_activityA.setOnClickListener {
            val intent =Intent(this,ActivityB::class.java)
            startActivity(intent)
        }
        btn3_activityA.setOnClickListener {
            val intent =Intent(this,Activity_C::class.java)
            startActivity(intent)
        }
        btn4_activityA.setOnClickListener {
            val intent =Intent(this,Activity_D::class.java)
            startActivity(intent)
        }
    }




}
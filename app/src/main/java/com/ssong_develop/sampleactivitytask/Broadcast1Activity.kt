package com.ssong_develop.sampleactivitytask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class Broadcast1Activity : AppCompatActivity() {

    private lateinit var layout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast1)

        layout = findViewById(R.id.test_2)

        layout.setOnClickListener {
            val intent = Intent(this,Broadcast2Activity::class.java)
            startActivity(intent)
        }
    }
}
package com.ssong_develop.sampleactivitytask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class BroadcastActivity : AppCompatActivity() {

    private lateinit var layout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)

        layout = findViewById(R.id.test_1)

        layout.setOnClickListener {
            val intent = Intent(this,Broadcast1Activity::class.java)
            startActivity(intent)
        }
    }
}
package com.ssong_develop.sampleactivitytask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class Broadcast2Activity : AppCompatActivity() {

    private lateinit var layout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast2)

        layout = findViewById(R.id.test_3)

        layout.setOnClickListener {
            val intent = Intent(this,BroadcastActivity::class.java)
            startActivity(intent)
        }
    }
}
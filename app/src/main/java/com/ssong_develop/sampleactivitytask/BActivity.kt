package com.ssong_develop.sampleactivitytask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class BActivity : AppCompatActivity() {

    private lateinit var layout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        layout = findViewById(R.id.test_b)

        layout.setOnClickListener {
            val intent = Intent(this,CActivity::class.java)
            startActivity(intent)
        }
    }
}
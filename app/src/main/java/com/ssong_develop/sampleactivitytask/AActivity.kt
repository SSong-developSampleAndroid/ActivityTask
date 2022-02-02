package com.ssong_develop.sampleactivitytask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.ssong_develop.sampleactivitytask.service.AService

class AActivity : AppCompatActivity() {

    private lateinit var layout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        startService(Intent(this,AService::class.java))

        layout = findViewById(R.id.test_a)

        layout.setOnClickListener {
            val intent = Intent(this,BActivity::class.java)
            startActivity(intent)
        }
    }
}
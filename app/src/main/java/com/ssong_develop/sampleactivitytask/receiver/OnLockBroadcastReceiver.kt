package com.ssong_develop.sampleactivitytask.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.ssong_develop.sampleactivitytask.BroadcastActivity
import com.ssong_develop.sampleactivitytask.service.AService

class OnLockBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_SCREEN_ON -> {
                Toast.makeText(context,"SCREEN_ON",Toast.LENGTH_LONG).show()
                val activityIntent = Intent(context,BroadcastActivity::class.java)
                activityIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                context?.startActivity(activityIntent)
            }
            Intent.ACTION_SCREEN_OFF -> {
                Toast.makeText(context,"SCREEN_OFF",Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_BOOT_COMPLETED -> {
                // 왜 안타는지 이유를 모르겠음
                Toast.makeText(context,"BOOT_COMPLETED",Toast.LENGTH_LONG).show()
                val serviceIntent = Intent(context,AService::class.java)
                context?.startService(serviceIntent)
            }
        }
    }
}
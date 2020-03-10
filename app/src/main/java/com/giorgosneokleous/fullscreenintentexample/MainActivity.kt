package com.giorgosneokleous.fullscreenintentexample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.showFullScreenIntentButton).setOnClickListener {
            showNotificationWithFullScreenIntent()
        }

        findViewById<Button>(R.id.showFullScreenIntentWithDelayButton).setOnClickListener {
            scheduleNotification(false)
        }

        findViewById<Button>(R.id.showFullScreenIntentLockScreenWithDelayButton).setOnClickListener {
            scheduleNotification(true)
        }
    }
}


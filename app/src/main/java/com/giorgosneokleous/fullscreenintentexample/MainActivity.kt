package com.giorgosneokleous.fullscreenintentexample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.showFullScreenIntentButton).setOnClickListener {
            showFullScreenIntent()
        }

        findViewById<Button>(R.id.showFullScreenIntentWithDelayButton).setOnClickListener {
            scheduleFullScreenIntent()
        }
    }

    private fun scheduleFullScreenIntent() {
        TODO("Not yet implemented")
    }

    private fun showFullScreenIntent() {
        TODO("Not yet implemented")
    }
}

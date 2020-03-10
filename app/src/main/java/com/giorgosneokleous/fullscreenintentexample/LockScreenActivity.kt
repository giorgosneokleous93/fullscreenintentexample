package com.giorgosneokleous.fullscreenintentexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LockScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lock_screen)
        turnScreenAndKeyguardOn()
    }
}

package com.giorgosneokleous.fullscreenintentexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if(intent.getBooleanExtra(LOCK_SCREEN_KEY, true)) {
            context.showNotificationWithFullScreenIntent(true)
        } else {
            context.showNotificationWithFullScreenIntent()
        }
    }

    companion object {
        fun build(context: Context, isLockScreen: Boolean): Intent {
            return Intent(context, NotificationReceiver::class.java).also {
                it.putExtra(LOCK_SCREEN_KEY, isLockScreen)
            }
        }
    }
}

private const val LOCK_SCREEN_KEY = "lockScreenKey"

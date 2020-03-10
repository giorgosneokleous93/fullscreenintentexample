package com.giorgosneokleous.fullscreenintentexample

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import java.util.concurrent.TimeUnit

fun Context.scheduleNotification() {
    val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
    val timeInMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(SCHEDULE_TIME)

    with(alarmManager) {
        setExact(AlarmManager.RTC_WAKEUP, timeInMillis, getReceiver())
    }
}

private fun Context.getReceiver(): PendingIntent {
    val intent = Intent(this, NotificationReceiver::class.java)
    // for demo purposes no request code and no flags
    return PendingIntent.getBroadcast(this, 0, intent, 0)
}

private const val SCHEDULE_TIME = 5L

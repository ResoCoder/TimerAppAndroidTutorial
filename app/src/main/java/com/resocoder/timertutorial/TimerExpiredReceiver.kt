package com.resocoder.timertutorial

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.resocoder.timertutorial.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        //TODO: show notification

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}

package com.android.broadcastreceiver.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.widget.Toast

class AirPlaneModeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
            val airplaneModeOff = Settings.Global.getInt(
                context?.contentResolver,
                Settings.Global.AIRPLANE_MODE_ON
            ) != 1

            if (airplaneModeOff) Toast.makeText(
                context,
                "Modo avião desativado!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
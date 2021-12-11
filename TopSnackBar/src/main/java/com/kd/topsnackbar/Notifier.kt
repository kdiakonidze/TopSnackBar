package com.kd.topsnackbar

import android.content.Context
import android.widget.Toast

class Notifier(val context: Context) {

    fun notify(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}
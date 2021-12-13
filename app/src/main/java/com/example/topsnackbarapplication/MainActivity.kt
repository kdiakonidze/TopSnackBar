package com.example.topsnackbarapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.kd.topsnackbar.Notifier

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Snackbar.make()

        Notifier(this).notify("asa3333333333333sa")
    }
}
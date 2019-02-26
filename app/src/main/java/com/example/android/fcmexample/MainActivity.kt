package com.example.android.fcmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //https://console.firebase.google.com/u/0/project/fcmexample-8e0ae/notification -> firebase console test send messaging
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

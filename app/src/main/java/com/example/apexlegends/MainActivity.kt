package com.example.apexlegends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
// Import
import android.os.Handler;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use
        val handler = Handler()
        handler.postDelayed({
            // do something after 1000ms
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
            finish()
        }, 3000)


    }
}
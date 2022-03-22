package com.example.apexlegends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basic.*

class weapon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weapon)

        //เริ่มหัวข้อใหญ่
        img_home.setOnClickListener {
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
            finish()
        }

        img_left.setOnClickListener {
            val intent = Intent(this, mode::class.java)
            startActivity(intent)
            finish()
        }

        img_right.setOnClickListener {
            val intent = Intent(this, htplay::class.java)
            startActivity(intent)
            finish()
        }
        //จบหัวข้อใหญ่
    }
}
package com.example.apexlegends

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NavUtils
import kotlinx.android.synthetic.main.activity_basic.*
import kotlinx.android.synthetic.main.activity_menu.*


class basic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
        //เริ่มหัวข้อใหญ่
        img_home.setOnClickListener {
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
            finish()
        }

        img_left.setOnClickListener {
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
            finish()
        }

        img_right.setOnClickListener {
            val intent = Intent(this, map::class.java)
            startActivity(intent)
            finish()
        }
        //จบหัวข้อใหญ่
    }

}
package com.example.apexlegends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_basic.setOnClickListener {
            val intent = Intent(this, basic::class.java)
            startActivity(intent)
            finish()
        }

        btn_map.setOnClickListener {
            val intent = Intent(this, map::class.java)
            startActivity(intent)
            finish()
        }

        btn_character.setOnClickListener {
            val intent = Intent(this, character::class.java)
            startActivity(intent)
            finish()
        }

        btn_mode.setOnClickListener {
            val intent = Intent(this, mode::class.java)
            startActivity(intent)
            finish()
        }

        btn_weapon.setOnClickListener {
            val intent = Intent(this, weapon::class.java)
            startActivity(intent)
            finish()
        }

        btn_htplay.setOnClickListener {
            val intent = Intent(this, htplay::class.java)
            startActivity(intent)
            finish()
        }
    }
}
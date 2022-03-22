package com.example.apexlegends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basic.*
import kotlinx.android.synthetic.main.activity_basic.img_home
import kotlinx.android.synthetic.main.activity_basic.img_left
import kotlinx.android.synthetic.main.activity_basic.img_right
import kotlinx.android.synthetic.main.activity_character.*

class character : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)

        //เริ่มหัวข้อใหญ่
        img_home.setOnClickListener {
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
            finish()
        }

        img_left.setOnClickListener {
            val intent = Intent(this, map::class.java)
            startActivity(intent)
            finish()
        }

        img_right.setOnClickListener {
            val intent = Intent(this, mode::class.java)
            startActivity(intent)
            finish()
        }
        //จบหัวข้อใหญ่

        //ไอคอน
        image_charoneicon.setOnClickListener {
            val intent = Intent(this, charone::class.java)
            startActivity(intent)
            finish()
        }

        image_chartwoicon.setOnClickListener {
            val intent = Intent(this, chartwo::class.java)
            startActivity(intent)
            finish()
        }

        image_charthreeicon.setOnClickListener {
            val intent = Intent(this, charthree::class.java)
            startActivity(intent)
            finish()
        }

        image_charfouricon.setOnClickListener {
            val intent = Intent(this, charfour::class.java)
            startActivity(intent)
            finish()
        }

        image_charfiveicon.setOnClickListener {
            val intent = Intent(this, charfive::class.java)
            startActivity(intent)
            finish()
        }

        image_charsixicon.setOnClickListener {
            val intent = Intent(this, charsix::class.java)
            startActivity(intent)
            finish()
        }

        image_charsevenicon.setOnClickListener {
            val intent = Intent(this, charseven::class.java)
            startActivity(intent)
            finish()
        }

        image_chareighticon.setOnClickListener {
            val intent = Intent(this, chareight::class.java)
            startActivity(intent)
            finish()
        }

        image_charnineicon.setOnClickListener {
            val intent = Intent(this, charnine::class.java)
            startActivity(intent)
            finish()
        }

        image_chartenicon.setOnClickListener {
            val intent = Intent(this, charten::class.java)
            startActivity(intent)
            finish()
        }

        image_charelevicon.setOnClickListener {
            val intent = Intent(this, charelev::class.java)
            startActivity(intent)
            finish()
        }

        image_chartwelicon.setOnClickListener {
            val intent = Intent(this, chartwel::class.java)
            startActivity(intent)
            finish()
        }

        image_chartourticon.setOnClickListener {
            val intent = Intent(this, chartourt::class.java)
            startActivity(intent)
            finish()
        }

        image_charfourticon.setOnClickListener {
            val intent = Intent(this, charfourt::class.java)
            startActivity(intent)
            finish()
        }

        image_charfifticon.setOnClickListener {
            val intent = Intent(this, charfift::class.java)
            startActivity(intent)
            finish()
        }

        image_charsixticon.setOnClickListener {
            val intent = Intent(this, charsixt::class.java)
            startActivity(intent)
            finish()
        }

        image_charseventicon.setOnClickListener {
            val intent = Intent(this, charsevent::class.java)
            startActivity(intent)
            finish()
        }

        image_chareightteicon.setOnClickListener {
            val intent = Intent(this, chareightte::class.java)
            startActivity(intent)
            finish()
        }

        image_charnineticon.setOnClickListener {
            val intent = Intent(this, charninet::class.java)
            startActivity(intent)
            finish()
        }

        image_chartwenticon.setOnClickListener {
            val intent = Intent(this, chartwent::class.java)
            startActivity(intent)
            finish()
        }
        //--------------
    }
}
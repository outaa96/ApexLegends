package com.example.apexlegends

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_charone.*

class charfive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charfive)
        //วิดีโอ
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val onlineUri: Uri = Uri.parse("https://cdn.videvo.net/videvo_files/video/free/2019-11/large_watermarked/190301_1_25_11_preview.mp4")
        videoView.setMediaController(mediaController)
        videoView.setOnPreparedListener { mp -> mp.isLooping = true }
        videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.videocharfive))
        videoView.requestFocus()
        videoView.start()


        //เริ่มหัวข้อใหญ่
        img_home.setOnClickListener {
            val intent = Intent(this, character::class.java)
            startActivity(intent)
            finish()
        }

        img_left.setOnClickListener {
            val intent = Intent(this, charfour::class.java)
            startActivity(intent)
            finish()
        }

        img_right.setOnClickListener {
            val intent = Intent(this, charsix::class.java)
            startActivity(intent)
            finish()
        }
        //จบหัวข้อใหญ่
    }
}
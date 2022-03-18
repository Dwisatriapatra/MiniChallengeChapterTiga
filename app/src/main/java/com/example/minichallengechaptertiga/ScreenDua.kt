package com.example.minichallengechaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen_dua.*

class ScreenDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_dua)
        button_go_to_screen_tiga.setOnClickListener {
            val intent = Intent(this, ScreenTiga::class.java)
            intent.putExtra("challenge_inputan_nama", challenge_inputan_nama.text.toString())
            startActivity(intent)
        }
    }
}
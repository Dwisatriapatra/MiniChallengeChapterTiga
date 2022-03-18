package com.example.minichallengechaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen_satu.*

class ScreenSatu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_satu)
        button_go_to_screen_dua.setOnClickListener {
            val intent = Intent(this, ScreenDua::class.java)
            startActivity(intent)
        }
    }
}
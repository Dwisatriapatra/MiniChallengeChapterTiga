package com.example.minichallengechaptertiga

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_screen_empat.*

class ScreenEmpat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_empat)

        button_back_to_screen_tiga.setOnClickListener {
            val usia = challenge_inputan_usia.text.toString()
            val alamat = challenge_inputan_alamat.text.toString()
            val pekerjaan = challenge_inputan_pekerjaan.text.toString()
            val nama = intent.getStringExtra("challenge_inputan_nama").toString()
            val bundle = Bundle()
            val intent = Intent(this, ScreenTiga::class.java)
            bundle.putString("challenge_inputan_nama", nama)
            bundle.putString("challenge_inputan_usia", usia)
            bundle.putString("challenge_inputan_alamat", alamat)
            bundle.putString("challenge_inputan_pekerjaan", pekerjaan)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
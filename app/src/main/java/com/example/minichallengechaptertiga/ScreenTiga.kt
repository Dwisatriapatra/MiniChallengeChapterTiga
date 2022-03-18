package com.example.minichallengechaptertiga

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_screen_tiga.*

class ScreenTiga : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_tiga)
        val nama = intent.getStringExtra("challenge_inputan_nama")
        challenge_result_screen_tiga.text = nama
        button_go_to_screen_empat.setOnClickListener {
            val intent = Intent(this, ScreenEmpat::class.java)
            intent.putExtra("challenge_inputan_nama", nama)
            startActivity(intent)
        }
        if(intent.hasExtra("challenge_inputan_usia")){
            val bundleContent2 = intent.extras
            val nama2 = bundleContent2?.getString("challenge_inputan_nama").toString()
            val usia = bundleContent2?.getString("challenge_inputan_usia").toString()
            val alamat = bundleContent2?.getString("challenge_inputan_alamat").toString()
            val pekerjaan = bundleContent2?.getString("challenge_inputan_pekerjaan").toString()
            challenge_result_screen_tiga.text = "$nama2\n"
            if(usia.toInt() % 2 == 0){
                challenge_result_screen_tiga.append("$usia, genap\n")
            }else{
                challenge_result_screen_tiga.append("$usia, ganjil\n")
            }
            challenge_result_screen_tiga.append("$alamat \n")
            challenge_result_screen_tiga.append("$pekerjaan \n")
        }
    }
}
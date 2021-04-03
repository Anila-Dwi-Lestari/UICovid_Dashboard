package com.anila.stematel.uicovid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardView5.setOnClickListener {
            val intent = Intent(this, covidDetails::class.java)
            startActivity(intent)
        }

        imageView11.setOnClickListener {
            val intent = Intent(this, cucitangan::class.java)
            startActivity(intent)
        }

        imageView12.setOnClickListener {
            val intent = Intent(this, masker::class.java)
            startActivity(intent)
        }
    }
}

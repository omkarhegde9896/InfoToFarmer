package com.example.infotofarmer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aboutuss.setOnClickListener {
            val intent = Intent(this,aboutus::class.java)
            startActivity(intent)

        }
        logininitial.setOnClickListener {
            val intent = Intent(this,loginpage::class.java)
            startActivity(intent)
        }

    }
}

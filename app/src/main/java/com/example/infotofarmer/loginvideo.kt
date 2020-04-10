package com.example.infotofarmer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loginnext.*
import kotlinx.android.synthetic.main.activity_loginvideo.*

class loginvideo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginvideo)

        tutobtn.setOnClickListener {
            val intent = Intent(this,tutoact::class.java)
            startActivity(intent)

        }
        whebtn.setOnClickListener {
            val intent = Intent(this,wheact::class.java)
            startActivity(intent)

        }
        govtbtn.setOnClickListener {
            val intent = Intent(this,govtact::class.java)
            startActivity(intent)

        }
    }
}

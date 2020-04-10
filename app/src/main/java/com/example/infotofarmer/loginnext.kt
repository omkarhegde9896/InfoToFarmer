package com.example.infotofarmer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loginnext.*

class loginnext : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginnext)

        scheme.setOnClickListener {
            val intent = Intent(this,schemesact::class.java)
            startActivity(intent)

        }
        cropbtn.setOnClickListener {
            val intent = Intent(this,cropact::class.java)
            startActivity(intent)

        }
        fertbtn.setOnClickListener {
            val intent = Intent(this,fertilizeract::class.java)
            startActivity(intent)

        }
        morebtn.setOnClickListener{
            val intent = Intent(this, loginvideo::class.java)
            startActivity(intent)

        }


    }
}

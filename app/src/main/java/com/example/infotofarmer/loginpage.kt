package com.example.infotofarmer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loginpage.*

class loginpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        btnLogin.setOnClickListener {
            //if (etName.text.toString().equals("Omkar") && etPassword.text.toString().equals("password")) {
                val intent = Intent(this, loginnext::class.java)
                startActivity(intent)
           // }
        }
    }
}

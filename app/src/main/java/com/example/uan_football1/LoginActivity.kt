package com.example.uan_football1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val btn: Button = findViewById(R.id.login)

        btn.setOnClickListener {
            val intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.signup)

        btn2.setOnClickListener {
            val intent2 = Intent(this, SignupActivity:: class.java)
            startActivity(intent2)
        }
    }
}

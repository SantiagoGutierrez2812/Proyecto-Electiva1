package com.example.uan_football1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TeamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)

        val btn: Button = findViewById(R.id.trophiesButton)

        btn.setOnClickListener {
            val intent = Intent(this, TeamTrophiesActivity:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.backTeam)

        btn2.setOnClickListener {
            finish()
        }

    }
}

package com.example.uan_football1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TeamTrophiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_trophies)

        val btn: Button = findViewById(R.id.matchesButton)

        btn.setOnClickListener {
            val intent = Intent(this, TeamTrophiesActivity:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.backTrophies)

        btn2.setOnClickListener {
            finish()
        }
    }
}
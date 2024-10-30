package com.example.uan_football1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TeamTrophiesActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_trophies)

        val teamId = intent.getIntExtra("teamId", -1)
        val trophiesTextView: TextView = findViewById(R.id.teamName)

        trophiesTextView.text = "Mostrando trofeos para el equipo con ID: $teamId"
    }
}

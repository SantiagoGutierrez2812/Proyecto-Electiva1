package com.example.uan_football1.models

data class Team(
    val id: Int,
    val name: String,
    val country: String,
    val founded: Int,
    val logo: String
)

data class Teams(
    val home: Team,
    val away: Team
)

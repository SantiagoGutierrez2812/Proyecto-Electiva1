package com.example.uan_football1.models

data class TeamsResponse(
    val response: List<TeamWrapper>  // Lista de equipos envueltos
)

data class TeamWrapper(
    val team: Team  // Cada TeamWrapper contiene un Team
)

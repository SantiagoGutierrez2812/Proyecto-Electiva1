package com.example.uan_football1.models

data class FixtureResponse(
    val response: List<FixtureWrapper>  // Lista de partidos envueltos
)

data class FixtureWrapper(
    val fixture: Fixture,     // Información del partido
    val teams: Teams,         // Equipos que juegan
    val goals: Goals          // Goles anotados
)

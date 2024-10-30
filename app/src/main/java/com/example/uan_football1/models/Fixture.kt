package com.example.uan_football1.models

data class Fixture(
    val id: Int,                // ID del partido
    val date: String,            // Fecha y hora del partido
    val status: Status           // Estado del partido
)

data class Status(
    val long: String,
    val short: String
)

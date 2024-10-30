package com.example.uan_football1.network

import com.example.uan_football1.models.FixtureResponse
import com.example.uan_football1.models.LeaguesResponse
import com.example.uan_football1.models.TeamsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface FootballApi {
    @Headers("x-apisports-key: 3ea496d7d11da44ce4983c1b1018cb54")
    @GET("leagues")
    fun getLeagues(): Call<LeaguesResponse>

    @GET("teams")
    fun getTeams(
        @Query("league") leagueId: Int,   // ID de la liga
        @Query("season") season: Int      // Temporada específica
    ): Call<TeamsResponse>

    @GET("fixtures")
    fun getFixtures(
        @Query("league") leagueId: Int,     // ID de la liga
        @Query("season") season: Int,       // Temporada
        @Query("date") date: String         // Fecha del partido en formato YYYY-MM-DD
    ): Call<FixtureResponse>


}

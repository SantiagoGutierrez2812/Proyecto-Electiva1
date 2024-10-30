package com.example.uan_football1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uan_football1.adapters.TeamAdapter
import com.example.uan_football1.models.TeamsResponse
import com.example.uan_football1.network.FootballApi
import com.example.uan_football1.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TeamActivity : AppCompatActivity() {

    private lateinit var teamsRecyclerView: RecyclerView
    private lateinit var teamAdapter: TeamAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)

        teamsRecyclerView = findViewById(R.id.teamsRecyclerView)
        teamsRecyclerView.layoutManager = LinearLayoutManager(this)

        val api = RetrofitClient.instance.create(FootballApi::class.java)
        val call = api.getTeams(leagueId = 39, season = 2023)

        call.enqueue(object : Callback<TeamsResponse> {
            override fun onResponse(
                call: Call<TeamsResponse>,
                response: Response<TeamsResponse>
            ) {
                if (response.isSuccessful) {
                    val teams = response.body()?.response?.map { it.team } ?: emptyList()
                    teamAdapter = TeamAdapter(teams) { team ->

                        val intent = Intent(this@TeamActivity, TeamTrophiesActivity::class.java)
                        intent.putExtra("teamId", team.id)
                        startActivity(intent)
                    }
                    teamsRecyclerView.adapter = teamAdapter
                } else {
                    Log.e("API Error", "Error: ${response.code()} - ${response.message()}")
                }
            }

            override fun onFailure(call: Call<TeamsResponse>, t: Throwable) {
                Log.e("API Error", "Failed to fetch teams", t)
            }
        })
    }
}

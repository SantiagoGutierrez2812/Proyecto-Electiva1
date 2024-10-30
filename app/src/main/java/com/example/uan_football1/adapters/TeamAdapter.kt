package com.example.uan_football1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.uan_football1.R
import com.example.uan_football1.models.Team

class TeamAdapter(
    private val teams: List<Team>,
    private val onItemClick: (Team) -> Unit
) : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    inner class TeamViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val teamLogo: ImageView = view.findViewById(R.id.teamIcon)
        val teamName: TextView = view.findViewById(R.id.teamName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_team, parent, false)
        return TeamViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val team = teams[position]
        holder.teamName.text = team.name

        Glide.with(holder.itemView.context)
            .load(team.logo)
            .into(holder.teamLogo)

        holder.itemView.setOnClickListener { onItemClick(team) }
    }

    override fun getItemCount(): Int = teams.size
}

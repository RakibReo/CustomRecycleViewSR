package com.example.custom_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamViewHolder> {

    private Context context;
    private List<FTeam> fTeamList;

    public TeamAdapter(Context context, List<FTeam> fTeamList) {
        this.context = context;
        this.fTeamList = fTeamList;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_team, parent, false);
        TeamViewHolder teamViewHolder = new TeamViewHolder(view);
        return teamViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {

        FTeam team = fTeamList.get(position);
        holder.titelText.setText(team.getTeamName());
        holder.grouptext.setText(team.getGroupName());


        Glide.with(context).load(team.getFlag()).placeholder(R.drawable.placeholder).into(holder.imag);


    }

    @Override
    public int getItemCount() {
        return fTeamList.size();
    }
}

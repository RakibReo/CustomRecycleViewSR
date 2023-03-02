package com.example.custom_recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TeamViewHolder extends RecyclerView.ViewHolder {

    ImageView imag;
    TextView titelText;
    TextView  grouptext;

    public TeamViewHolder(@NonNull View itemView) {

        super(itemView);

        imag=itemView.findViewById(R.id.imag);
        titelText=itemView.findViewById(R.id.titelText);
        grouptext=itemView.findViewById(R.id.grouptext);

    }
}

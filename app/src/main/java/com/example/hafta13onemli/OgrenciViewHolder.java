package com.example.hafta13onemli;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OgrenciViewHolder extends RecyclerView.ViewHolder {

    TextView txtOgrenciAdi;


    public OgrenciViewHolder(@NonNull View itemView) {

        super(itemView);

        txtOgrenciAdi = itemView.findViewById(R.id.txtOgrenciAdi);

    }













}

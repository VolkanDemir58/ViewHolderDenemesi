package com.example.hafta13onemli;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OgrenciAdapter extends RecyclerView.Adapter<OgrenciViewHolder> {

         String[] ogrenciler;


    public OgrenciAdapter(String[] ogrenciler) {

        this.ogrenciler = ogrenciler;

    }


    @NonNull

    @Override

    public OgrenciViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_ogrencil, viewGroup,false);

        return new OgrenciViewHolder(view);

    }


    @Override

    public void onBindViewHolder(@NonNull OgrenciViewHolder viewHolder, int position) {


        viewHolder.txtOgrenciAdi.setText(ogrenciler[position]);

    }


    @Override

    public int getItemCount() {

        return ogrenciler.length;

    }




}

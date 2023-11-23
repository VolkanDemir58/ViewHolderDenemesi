package com.example.hafta13onemli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView rcvOgrenciler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvOgrenciler=findViewById(R.id.rcvOgrenciler);

       /* ArrayList<String> ogrenciler = new ArrayList<>();
        ogrenciler.add("volkan");
        ogrenciler.add("ilayda");
        ogrenciler.add("tolga");
        ogrenciler.add("orhan");
        ogrenciler.add("ayşe");
        ogrenciler.add("namık");
        ogrenciler.add("kemal");
        ogrenciler.add("beyza");
      */
        String[]ogrenciler = getResources().getStringArray(R.array.Ogrenciler);
        OgrenciAdapter ogrenciAdapter=new OgrenciAdapter(ogrenciler);
        rcvOgrenciler.setAdapter(ogrenciAdapter);


        //LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);

        //linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);

       // rcvOgrenciler.setLayoutManager(linearLayoutManager);


        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcvOgrenciler.setLayoutManager(gridLayoutManager);














    }
}
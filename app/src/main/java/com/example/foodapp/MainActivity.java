package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.adapter.AmericanFoodAdapter;
import com.example.foodapp.adapter.PopularFoodAdapter;
import com.example.foodapp.model.AmericanFood;
import com.example.foodapp.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, americanRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AmericanFoodAdapter americanFoodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("beans with steak","$7.21",R.drawable.food1));
        popularFoodList.add(new PopularFood("Pizza","$9.21",R.drawable.food2));
        popularFoodList.add(new PopularFood("Burgher","$5.21",R.drawable.food3));
        popularFoodList.add(new PopularFood("beans with steak","$7.21",R.drawable.food1));
        popularFoodList.add(new PopularFood("Pizza","$9.21",R.drawable.food2));
        popularFoodList.add(new PopularFood("Burgher","$5.21",R.drawable.food3));
        setPopularRecycler(popularFoodList);

        List<AmericanFood> americanFoodList = new ArrayList<>();
        americanFoodList.add(new AmericanFood("Chicago Steak","$20.55",R.drawable.steak,"4.6","Jarvis Steak"));
        americanFoodList.add(new AmericanFood("Diavola Pizza","$15.44",R.drawable.diavo,"4.9","Beto's Pizza"));
        setAmericanRecycler(americanFoodList);
    }
    private void setPopularRecycler(List<PopularFood> popularFoodList){
        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }
    private void setAmericanRecycler(List<AmericanFood> americanFoodList){
        americanRecycler = findViewById(R.id.amer);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        americanRecycler.setLayoutManager(layoutManager);
        americanFoodAdapter = new AmericanFoodAdapter(this, americanFoodList);
        americanRecycler.setAdapter(americanFoodAdapter);
    }
}
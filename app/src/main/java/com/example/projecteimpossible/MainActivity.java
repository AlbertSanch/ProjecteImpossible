package com.example.projecteimpossible;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;


public  class MainActivity extends AppCompatActivity {

    ImageButton restaurants, movies,hotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restaurants=findViewById(R.id.botrestau);
        movies=findViewById(R.id.botmovies);
        hotel=findViewById(R.id.bothotels);

    }
    public void onclick(View view) {

        if (view.getId() == restaurants.getId()) {
            Intent i1 = new Intent(getApplicationContext(), activity_restaurant.class);
            startActivity(i1);
        }
        if (view.getId() == movies.getId()) {
            Intent i2 = new Intent(getApplicationContext(), activity_movies.class);
            startActivity(i2);
        }
        if (view.getId() == hotel.getId()) {
            Intent i1 = new Intent(getApplicationContext(),Hotel.class);
            startActivity(i1);
        }

    }

    }


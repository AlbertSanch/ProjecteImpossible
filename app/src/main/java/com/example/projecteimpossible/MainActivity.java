package com.example.projecteimpossible;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.widget.Adapter;
import android.widget.ImageButton;


public  class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton hotel = findViewById(R.id.bothotels);
        ImageButton movies = findViewById(R.id.botmovies);
        ImageButton restaurant = findViewById(R.id.botrestau);
        ImageButton parking = findViewById(R.id.botparking);


        hotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i1 = new Intent(getApplicationContext(), Hotel.class);
                startActivity(i1);
            }
        });

        movies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), activity_movies.class);
                startActivity(i2);
            }
        });

        restaurant.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(), activity_restaurant.class);
                startActivity(i3);
            }
        });
        parking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i4 = new Intent(getApplicationContext(), parking.class);
                startActivity(i4);
            }
        });
    }
}




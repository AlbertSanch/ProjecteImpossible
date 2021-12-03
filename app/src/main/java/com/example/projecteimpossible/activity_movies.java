package com.example.projecteimpossible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_movies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
    }
    public void onclick(View view) {

        Intent i1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i1);

    }
}
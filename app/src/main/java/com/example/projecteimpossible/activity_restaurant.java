package com.example.projecteimpossible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class activity_restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] letra = {"A","B","C","D","E"};
        spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, letra));
    }
    public void onclick(View view) {

            Intent i1 = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i1);

    }
}
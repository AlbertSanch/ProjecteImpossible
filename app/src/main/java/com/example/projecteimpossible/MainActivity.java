package com.example.projecteimpossible;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ImageButton hotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hotel=findViewById(R.id.b3);
    }

        public void onclick(View view) {

            if (view.getId() == hotel.getId()) {
                Intent i1 = new Intent(getApplicationContext(),Hotel.class);
                startActivity(i1);
            }

        }
    }

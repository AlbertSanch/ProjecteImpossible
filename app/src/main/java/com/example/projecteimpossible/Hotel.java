package com.example.projecteimpossible;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

import java.util.ArrayList;

public class Hotel extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner;

    private final ArrayList<String> lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        spinner = findViewById(R.id.h5);
        crearlista();
        clickat();

        Button hmenu= findViewById(R.id.hmenu);
        hmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(g);
            }
        });
    }



    private void clickat(){
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);///llista array
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);///perque es desplegui aball
        spinner.setAdapter(adapter);

    }
    private void crearlista(){
        lista.add("");
        lista.add("☆☆☆");
        lista.add("☆☆☆☆");
        lista.add("☆☆☆☆☆");
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String valor;
        valor = (String) adapterView.getSelectedItem();
        FragmentManager fm1 = getSupportFragmentManager();
        hotelFragment hotelFragment = new hotelFragment();
        FragmentManager fm3 = getSupportFragmentManager();
        fragmenth3 fragmenth3 = new fragmenth3();
        FragmentManager fm4 = getSupportFragmentManager();
        fragmenth4 fragmenth4 = new fragmenth4();
        switch (valor){
            case "":

                break;
            case "☆☆☆":
                //getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.contenidor))).commit();
                fm3.beginTransaction().replace(R.id.contenidor,fragmenth3).commit();
                break;
            case "☆☆☆☆":
               // getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.contenidor))).commit();
                fm4.beginTransaction().replace(R.id.contenidor,fragmenth4).commit();
                break;
            case "☆☆☆☆☆":
                //getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.contenidor))).commit();
                fm1.beginTransaction().replace(R.id.contenidor,hotelFragment).commit();
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
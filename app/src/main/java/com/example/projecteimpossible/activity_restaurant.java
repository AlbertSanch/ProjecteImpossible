package com.example.projecteimpossible;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Objects;

public class activity_restaurant extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    private final ArrayList<String> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        spinner = findViewById(R.id.spinner);
        crearlista();
        clickat();



    }
    private void clickat(){
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);///llista array
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);///perque es desplegui aball
        spinner.setAdapter(adapter);
    }
    private void crearlista(){
        lista.add("5 ESTRELLAS");
        lista.add("4 ESTRELLAS");
        lista.add("3 ESTRELLAS");
    }


    public void onclick(View view) {

        Intent i1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i1);

        }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String valor;
        valor = (String) adapterView.getSelectedItem();
        FragmentManager fm1 = getSupportFragmentManager();
        Fragmentcinco fragment1 = new Fragmentcinco();
        FragmentManager fm2 = getSupportFragmentManager();
        Fragmentcuatro fragment2 = new Fragmentcuatro();
        FragmentManager fm3 = getSupportFragmentManager();
        Fragmenttres fragment3 = new Fragmenttres();
        switch (valor){
            case "5 ESTRELLAS":
                if (getSupportFragmentManager().findFragmentById(R.id.container)!=null){
                    getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.container))).commit();
                }
                fm1.beginTransaction().add(R.id.container,fragment1).commit();
                break;
            case "4 ESTRELLAS":
                if (getSupportFragmentManager().findFragmentById(R.id.container)!=null){
                    getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.container))).commit();
                }
                fm2.beginTransaction().add(R.id.container,fragment2).commit();
                break;
            case "3 ESTRELLAS":
                if (getSupportFragmentManager().findFragmentById(R.id.container)!=null){
                    getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.container))).commit();
                }
                fm3.beginTransaction().add(R.id.container,fragment3).commit();
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
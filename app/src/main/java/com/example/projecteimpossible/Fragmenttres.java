package com.example.projecteimpossible;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragmenttres#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmenttres extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragmenttres() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmenttres.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmenttres newInstance(String param1, String param2) {
        Fragmenttres fragment = new Fragmenttres();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragmenttres, container, false);
        TextView telefonbug= (TextView) v.findViewById(R.id.telefonburger);
        TextView link1= (TextView) v.findViewById(R.id.burgerlink);
        TextView telefonmcdo= (TextView) v.findViewById(R.id.telefonmcdo);
        TextView link3= (TextView) v.findViewById(R.id.mcdolink);
        // Inflate the layout for this fragment
        link3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://mcdonalds.es/"));
                startActivity(intent1);
            }
        });
        telefonmcdo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel: +911 93 12 65"));
                startActivity(intent2);
            }
        });
        link1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.burgerking.es/home"));
                startActivity(intent1);
            }
        });
        telefonbug.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel: +911 93 49 22"));
                startActivity(intent2);
            }
        });
        return v;
    }
}
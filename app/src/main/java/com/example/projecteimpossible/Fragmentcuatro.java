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
 * Use the {@link Fragmentcuatro#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmentcuatro extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragmentcuatro() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmentcuatro.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmentcuatro newInstance(String param1, String param2) {
        Fragmentcuatro fragment = new Fragmentcuatro();
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
        View v=inflater.inflate(R.layout.fragment_fragmentcuatro, container, false);
        TextView telefonbug= (TextView) v.findViewById(R.id.telefonburger);
        TextView t1= (TextView) v.findViewById(R.id.burgerlink);
        TextView telefonabac= (TextView) v.findViewById(R.id.abactelefon);
        TextView link2= (TextView) v.findViewById(R.id.abaclink);
        TextView telefonmcdo= (TextView) v.findViewById(R.id.telefonmcdo);
        TextView link3= (TextView) v.findViewById(R.id.mcdolink);
        TextView telefonsalita= (TextView) v.findViewById(R.id.telefonsalita);
        TextView link4= (TextView) v.findViewById(R.id.salitalink);
        TextView telefonamazonico= (TextView) v.findViewById(R.id.telefonamazonico);
        TextView link5= (TextView) v.findViewById(R.id.amazonicolink);

        t1.setOnClickListener(new View.OnClickListener() {
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
        link2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://abacrestaurant.com/es"));
                startActivity(intent1);
            }
        });
        telefonabac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel: +911 93 52 18"));
                startActivity(intent2);
            }
        });
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
        link4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.salita.es/"));
                startActivity(intent1);
            }
        });
        telefonsalita.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel: +911 43 54 33"));
                startActivity(intent2);
            }
        });
        link5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://amazonicorestaurant.com/"));
                startActivity(intent1);
            }
        });
        telefonamazonico.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel: +911 93 78 23"));
                startActivity(intent2);
            }
        });
        // Inflate the layout for this fragment
        return v;

    }
}
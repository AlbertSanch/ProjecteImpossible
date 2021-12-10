package com.example.projecteimpossible;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmenth3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmenth3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragmenth3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmenth3.
     */
    // TODO: Rename and change types and number of parameters
    public static fragmenth3 newInstance(String param1, String param2) {
        fragmenth3 fragment = new fragmenth3();
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
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_fragmenth3, container, false);
        ImageView web= (ImageView) v.findViewById(R.id.link51);
        ImageView web1= (ImageView) v.findViewById(R.id.link52);
        ImageView web2= (ImageView) v.findViewById(R.id.link53);
        ImageView t1= (ImageView) v.findViewById(R.id.f1);
        ImageView t2= (ImageView) v.findViewById(R.id.f2);
        ImageView t3= (ImageView) v.findViewById(R.id.f3);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/es/passeig-de-gra-cia-luxury.es.html"));
                startActivity(intent4);
            }
        });

        web1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent5 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/es/mitre.es.html"));
                startActivity(intent5);

            }
        });

        web2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent6 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/es/abbaramblahotelbarcelona.es.html"));
                startActivity(intent6);

            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+684329831"));
                startActivity(intent1);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+808439419"));
                startActivity(intent2);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+895627490"));
                startActivity(intent3);
            }
        });
        return v;
    }
}
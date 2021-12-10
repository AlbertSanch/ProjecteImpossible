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
 * Use the {@link fragmenth4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmenth4 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragmenth4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmenth4.
     */
    // TODO: Rename and change types and number of parameters
    public static fragmenth4 newInstance(String param1, String param2) {
        fragmenth4 fragment = new fragmenth4();
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
        View v=inflater.inflate(R.layout.fragment_fragmenth4, container, false);
        ImageView web= (ImageView) v.findViewById(R.id.link51);
        ImageView web1= (ImageView) v.findViewById(R.id.link52);
        ImageView web2= (ImageView) v.findViewById(R.id.link53);
        ImageView t1= (ImageView) v.findViewById(R.id.t1);
        ImageView t2= (ImageView) v.findViewById(R.id.t2);
        ImageView t3= (ImageView) v.findViewById(R.id.t3);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/es/room-mate-gerard.es.html"));
                startActivity(intent4);
            }
        });

        web1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent5 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/es/h10-casa-mimosa.es.html"));
                startActivity(intent5);
            }
        });

        web2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent6 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/es/well-and-come.es.html"));
                startActivity(intent6);
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+8548443131"));
                startActivity(intent1);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+608933799"));
                startActivity(intent2);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+832097478"));
                startActivity(intent3);
            }
        });

        return v;
    }
}
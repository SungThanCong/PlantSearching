package com.example.plantsearching.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.plantsearching.ArticleActivity;
import com.example.plantsearching.R;

public class HomeFragment extends Fragment {

    CardView btn_to_article;
    RecyclerView lsvPhotography;
    public HomeFragment() {

    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btn_to_article = view.findViewById(R.id.btn_to_article);
        lsvPhotography = view.findViewById(R.id.lsvPhotography);

        addEvents();

        return view;
    }

    private void addEvents() {
        btn_to_article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ArticleActivity.class);
                startActivity(intent);
            }
        });

    }
}
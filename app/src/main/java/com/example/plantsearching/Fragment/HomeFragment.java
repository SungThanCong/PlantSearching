package com.example.plantsearching.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.plantsearching.Adapter.PhotographyAdapter;
import com.example.plantsearching.ArticleActivity;
import com.example.plantsearching.R;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeFragment extends Fragment {

    CardView btn_to_article;
    RecyclerView lsvPhotography;
    ArrayList<String> photographyData = new ArrayList<String>(Arrays.asList(
            "https://firebasestorage.googleapis.com/v0/b/plan-app-3f6f5.appspot.com/o/photography%2Fphotography_1.png?alt=media&token=d2ea54f4-21a1-4465-bb52-37c2f16669e4"
            ,"https://firebasestorage.googleapis.com/v0/b/plan-app-3f6f5.appspot.com/o/photography%2Fphotography_1.png?alt=media&token=d2ea54f4-21a1-4465-bb52-37c2f16669e4"
            ,"https://firebasestorage.googleapis.com/v0/b/plan-app-3f6f5.appspot.com/o/photography%2Fphotography_1.png?alt=media&token=d2ea54f4-21a1-4465-bb52-37c2f16669e4"));
    PhotographyAdapter adapter;
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

        lsvPhotography.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        adapter = new PhotographyAdapter(getActivity(),photographyData);
        lsvPhotography.setAdapter(adapter);

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
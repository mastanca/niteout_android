package com.mstancanelli.niteout.home;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mstancanelli.niteout.R;
import com.mstancanelli.niteout.home.adapters.HomeRecyclerAdapter;
import com.mstancanelli.niteout.models.Place;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mstancanelli on 8/1/16.
 */
public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.activity_home_recycler_view);

        // Layout manager decide si va vertical/horizontal, las config de la lista
        // Adapter adapta los elementos a la view

        List<Place> places = new ArrayList<>();
        places.add(new Place());
        places.add(new Place());
        places.add(new Place());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        HomeRecyclerAdapter adapter = new HomeRecyclerAdapter(this, places);
        recyclerView.setAdapter(adapter);


    }
}

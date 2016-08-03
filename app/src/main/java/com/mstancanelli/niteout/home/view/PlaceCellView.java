package com.mstancanelli.niteout.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mstancanelli.niteout.R;

/**
 * Created by mstancanelli on 8/3/16.
 */
public class PlaceCellView extends LinearLayout{

    private TextView nameView, priceView;

    public PlaceCellView(Context context) {
        this(context, null);
    }

    public PlaceCellView(Context context, AttributeSet attrs){
        super(context, attrs);

        inflate(context, R.layout.view_place_cell, this);

        nameView = (TextView) findViewById(R.id.view_place_cell_name);
        priceView = (TextView) findViewById(R.id.view_place_cell_price);
    }

    public void setName(String name) {
        nameView.setText(name);
    }

    public void setPrice(String price) {
        nameView.setText(price);
    }

}

package com.mstancanelli.niteout.home.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mstancanelli.niteout.R;
import com.mstancanelli.niteout.home.view.PlaceCellView;
import com.mstancanelli.niteout.models.Place;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by mstancanelli on 8/3/16.
 */
public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder> {

    private List<Place> places;
    private WeakReference<Context> contextRef;

    public HomeRecyclerAdapter(Context context, List<Place> places) {
        this.places = places;
        contextRef = new WeakReference<>(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Si uso el parent la estoy cagando
        return new ViewHolder(new PlaceCellView(contextRef.get()));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Place place = places.get(position);
        holder.getPlaceCellView().setName(place.getName());
        holder.getPlaceCellView().setPrice(place.getPrice());
    }

    @Override
    public int getItemCount() {
        return places == null ? 0 : places.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private PlaceCellView placeCellView;

        public ViewHolder(View itemView) {
            super(itemView);
            placeCellView = (PlaceCellView) itemView;
        }

        public PlaceCellView getPlaceCellView() {
            return placeCellView;
        }
    }

}

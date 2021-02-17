package com.example.edinbughtourguideapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {


    public interface OnItemClickListener {
        void onItemClick(Places item);
    }

    private List<Places> places;
    private final OnItemClickListener onItemClickListener;

    // data is passed into the constructor
    public PlacesAdapter(List<Places> places, OnItemClickListener onItemClickListener) {
        this.places = places;
        this.onItemClickListener = onItemClickListener;
    }
    @NonNull
    @Override
    public PlacesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesAdapter.ViewHolder holder, int position) {
        Places currentPlace = places.get(position);
        holder.bind(currentPlace, onItemClickListener);
    }


    @Override
    public int getItemCount() {
        return places.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleTextView;
        TextView informationTextView;
        ImageView vectorView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            titleTextView = itemView.findViewById(R.id.title_text_view);
            informationTextView = itemView.findViewById(R.id.information_text_view);
            vectorView = itemView.findViewById(R.id.vector_image_view);
        }

        void bind(Places currentPlace, final OnItemClickListener onItemClickListener) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            titleTextView.setText(currentPlace.getImageTitle());
            informationTextView.setText(currentPlace.getImageInformation());
            vectorView.setImageResource(currentPlace.getVectorLike());
            vectorView.setOnClickListener(v ->
                    onItemClickListener.onItemClick(currentPlace));
            }
        }

    public void updateData(List<Places> newData) {
        places = newData;
        notifyDataSetChanged();
    }
}

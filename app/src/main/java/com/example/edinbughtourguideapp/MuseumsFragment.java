package com.example.edinbughtourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MuseumsFragment#} factory method to
 * create an instance of this fragment.
 */
public class MuseumsFragment extends Fragment implements PlacesAdapter.OnItemClickListener {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(R.drawable.national_museum_scotland, getString(R.string.national_museum_of_scotland), getString(R.string.national_museum_of_scotland_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.museum_of_edinburgh, getString(R.string.museum_of_edinburgh), getString(R.string.museum_of_edinburgh_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.scottish_national_gallery, getString(R.string.scottish_national_gallery), getString(R.string.scottish_national_gallery_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.museum_of_childhood, getString(R.string.museum_of_childhood), getString(R.string.museum_of_childhood_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.surgeons_hall_museums, getString(R.string.surgeons_hall_museum), getString(R.string.surgeons_hall_museum_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.gallery_modern_art, getString(R.string.scottish_national_gallery_of_moder_art), getString(R.string.scottish_national_gallery_of_moder_art_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.portrait_gallery, getString(R.string.scottish_national_portrait_gallery), getString(R.string.scottish_national_portrait_gallery_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.writers_museum, getString(R.string.the_writers_museum), getString(R.string.the_writers_museum_information), R.drawable.ic_border_favorite));

        PlacesAdapter adapter = new PlacesAdapter(places, this);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);
        return rootView;
    }
    @Override
    public void onItemClick(Places item) {

    }

}
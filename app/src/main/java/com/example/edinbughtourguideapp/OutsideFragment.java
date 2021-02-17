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
 * Use the {@link OutsideFragment#} factory method to
 * create an instance of this fragment.
 */
public class OutsideFragment extends Fragment implements PlacesAdapter.OnItemClickListener {

    public OutsideFragment() {
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

        places.add(new Places(R.drawable.princes_street_gardens, getString(R.string.princes_street_gardens), getString(R.string.princes_street_gardens_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.dean_village, getString(R.string.dean_village), getString(R.string.dean_village_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.royal_botanic_garden, getString(R.string.royal_botanic_garden), getString(R.string.royal_botanic_garden_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.holyrood_park, getString(R.string.holyrood_park), getString(R.string.holyrood_park_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.water_of_leith, getString(R.string.water_of_leith), getString(R.string.water_of_leith_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.meadows, getString(R.string.the_meadows), getString(R.string.the_meadows_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.arthur_seat, getString(R.string.arthur_seat), getString(R.string.arthur_seat_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.portobello_beach, getString(R.string.portobello_beach), getString(R.string.portobello_beach_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.jupiter_artland, getString(R.string.jupiter_artland), getString(R.string.jupiter_artland_information), R.drawable.ic_border_favorite));

        PlacesAdapter adapter = new PlacesAdapter(places,this);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onItemClick(Places item) {

    }
}
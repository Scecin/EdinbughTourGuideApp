package com.example.edinbughtourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Top10Fragment extends Fragment implements PlacesAdapter.OnItemClickListener {


    public Top10Fragment() {
        // Required empty public constructor
    }
    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(R.drawable.royal_mile, getString(R.string.royal_mile), getString(R.string.royal_mile_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.edinburgh_castle, getString(R.string.edinburgh_castle), getString(R.string.edinburgh_castle_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.calton_hill, getString(R.string.calton_hill), getString(R.string.calton_hill_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.holyrood_palace, getString(R.string.holyrood_palace), getString(R.string.holyrood_palace_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.st_giles_cathedral, getString(R.string.st_giles_cathedral), getString(R.string.st_giles_cathedral_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.greyfriars_bobby, getString(R.string.greyfriars_bobby), getString(R.string.greyfriars_bobby_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.new_town, getString(R.string.new_town), getString(R.string.new_town_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.victoria_street, getString(R.string.victoria_street), getString(R.string.victoria_street_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.grassmarket, getString(R.string.grassmarket), getString(R.string.grassmarket_information), R.drawable.ic_border_favorite));
        places.add(new Places(R.drawable.princes_street, getString(R.string.princes_street), getString(R.string.princes_street_information), R.drawable.ic_border_favorite));

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

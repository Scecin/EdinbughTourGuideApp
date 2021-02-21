package com.example.edinbughtourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OutsideFragment#} factory method to
 * create an instance of this fragment.
 */
public class OutsideFragment extends Fragment implements PlacesAdapter.OnItemClickListener {

    ArrayList<Place> places = new ArrayList<Place>();
    PlacesAdapter adapter;

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
        adapter = new PlacesAdapter(this);
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);
        setPlaces();

        return rootView;
    }

    private void setPlaces() {

        places.add(new Place(R.drawable.princes_street_gardens, getString(R.string.princes_street_gardens), getString(R.string.princes_street_gardens_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.dean_village, getString(R.string.dean_village), getString(R.string.dean_village_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.royal_botanic_garden, getString(R.string.royal_botanic_garden), getString(R.string.royal_botanic_garden_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.holyrood_park, getString(R.string.holyrood_park), getString(R.string.holyrood_park_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.water_of_leith, getString(R.string.water_of_leith), getString(R.string.water_of_leith_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.meadows, getString(R.string.the_meadows), getString(R.string.the_meadows_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.arthur_seat, getString(R.string.arthur_seat), getString(R.string.arthur_seat_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.portobello_beach, getString(R.string.portobello_beach), getString(R.string.portobello_beach_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.jupiter_artland, getString(R.string.jupiter_artland), getString(R.string.jupiter_artland_information), R.drawable.ic_border_favorite));

        adapter.updateData(places);
    }

    @Override
    public void onItemClick(Place item) {
        for (int i = 0; i < places.size(); i ++) {
            Place place = places.get(i);
            if (place.getImageTitle().equals(item.getImageTitle())) {
                if (place.getVectorLike() == R.drawable.ic_border_favorite) {
                    place.setVectorLike(R.drawable.ic_black_favorite);
                } else {
                    place.setVectorLike(R.drawable.ic_border_favorite);
                }
                places.set(i, place);
            }
        }
        adapter.updateData(places);
    }
}
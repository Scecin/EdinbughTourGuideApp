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
 * Use the {@link InterestFragment} factory method to
 * create an instance of this fragment.
 */
public class InterestFragment extends Fragment implements PlacesAdapter.OnItemClickListener {

    ArrayList<Place> places = new ArrayList<Place>();
    PlacesAdapter adapter;

    public InterestFragment() {
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
        places.add(new Place(R.drawable.whisky_experiences, getString(R.string.whisky_experiences), getString(R.string.whisky_experiences_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.mary_king_close, getString(R.string.mary_king_close), getString(R.string.mary_king_close_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.stockbridge_market, getString(R.string.stockbridge_market), getString(R.string.stockbridge_market_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.camera_obscura, getString(R.string.camera_obscura), getString(R.string.camera_obscura_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.dynamic_earth, getString(R.string.dynamic_earth), getString(R.string.dynamic_earth_information), R.drawable.ic_border_favorite));

        adapter.updateData(places);
    }

    @Override
    public void onItemClick(Place item) {
        for (int i = 0; i<places.size(); i++) {
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
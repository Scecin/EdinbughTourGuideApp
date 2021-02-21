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
 * Use the {@link MuseumsFragment#} factory method to
 * create an instance of this fragment.
 */
public class MuseumsFragment extends Fragment implements PlacesAdapter.OnItemClickListener {

    ArrayList<Place> places = new ArrayList<Place>();
    PlacesAdapter adapter;

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
        adapter = new PlacesAdapter(this);
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);
        setPlaces();

        return rootView;
    }

    private void setPlaces() {

        places.add(new Place(R.drawable.national_museum_scotland, getString(R.string.national_museum_of_scotland), getString(R.string.national_museum_of_scotland_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.museum_of_edinburgh, getString(R.string.museum_of_edinburgh), getString(R.string.museum_of_edinburgh_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.scottish_national_gallery, getString(R.string.scottish_national_gallery), getString(R.string.scottish_national_gallery_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.museum_of_childhood, getString(R.string.museum_of_childhood), getString(R.string.museum_of_childhood_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.surgeons_hall_museums, getString(R.string.surgeons_hall_museum), getString(R.string.surgeons_hall_museum_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.gallery_modern_art, getString(R.string.scottish_national_gallery_of_moder_art), getString(R.string.scottish_national_gallery_of_moder_art_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.portrait_gallery, getString(R.string.scottish_national_portrait_gallery), getString(R.string.scottish_national_portrait_gallery_information), R.drawable.ic_border_favorite));
        places.add(new Place(R.drawable.writers_museum, getString(R.string.the_writers_museum), getString(R.string.the_writers_museum_information), R.drawable.ic_border_favorite));

        adapter.updateData(places);
    }

    @Override
    public void onItemClick(Place item) {
        for (int i = 0; i< places.size(); i++) {
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
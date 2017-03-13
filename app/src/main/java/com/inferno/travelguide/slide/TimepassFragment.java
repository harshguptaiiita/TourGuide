package com.inferno.travelguide.slide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.inferno.travelguide.R;
import com.inferno.travelguide.place;


/**
 * Created by harsh on 23/11/16.
 */

public class TimepassFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.movies,container,false);
        place[] places= {new place(R.drawable.city,"4/5","adafsdfafsd","New york"),new place(R.drawable.city,"4/5","adafsdfafsd","New york"),new place(R.drawable.city,"4/5","adafsdfafsd","New york")};
        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        // ListAdapter adapter = new ArrayAdapter<place>(getActivity(),android.R.layout.simple_list_item_1,places);
        //setListAdapter(adapter);
        ListView listView = (ListView) rootView.findViewById(R.id.list_timepass);


        listView.setAdapter(adapter);
        return rootView;
    }
}

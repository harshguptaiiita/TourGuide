package com.inferno.travelguide.slide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.inferno.travelguide.MainActivity;
import com.inferno.travelguide.R;
import com.inferno.travelguide.place;

/**
 * Created by Ratan on 7/29/2015.
 */
public class AncientFragment extends Fragment {

String s;
    String Tag="gdgdg";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.primary_layout,container,false);


        

        Log.v(Tag,"ghhbdh"+s);
        place[] places= {new place(R.drawable.allsaintscathedral,"4/5","adafsd","New york"),new place(R.drawable.alfredpark,"4/5","adafsdfafsd","New york"),new place(R.drawable.allahabadfort,"4/5","adafsdfafsd","New york"),new place(R.drawable.allahabadmuseum,"4/5","adafsdfafsd","New york")};
       PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        // ListAdapter adapter = new ArrayAdapter<place>(getActivity(),android.R.layout.simple_list_item_1,places);
        //setListAdapter(adapter);
        ListView listView = (ListView) rootView.findViewById(R.id.list_ancient);


        listView.setAdapter(adapter);
        return rootView;
    }

    public void getIntent()

    {

    }

}

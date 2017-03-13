package com.inferno.travelguide.slide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.inferno.travelguide.R;


import com.inferno.travelguide.place;

/**
 * Created by Suraj Singh on 11/24/2016.
 */
public class PlaceAdapter extends BaseAdapter {
    private place[] placeInfo;
    private Context context;
    private LayoutInflater inflater;

    public PlaceAdapter(Context mainActivity, place[] placeInfo) {
        context = mainActivity;
        this.placeInfo = placeInfo;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override public int getCount() {
        if (placeInfo != null) {
            return placeInfo.length;
        } else {
            return 0;
        }
    }

    @Override public Object getItem(int i) {
        return placeInfo[i];
    }

    @Override public long getItemId(int i) {
        return i;
    }

    @Override public View getView(int i, View convertView, ViewGroup viewGroup) {

        ViewHolder holder = null;
        View rowView = convertView;
        if (rowView == null) {
            holder = new ViewHolder();
            rowView = inflater.inflate(R.layout.list_item, null);
            holder.title = (TextView) rowView.findViewById(R.id.title);
            holder.image = (ImageView) rowView.findViewById(R.id.image);
            holder.rating = (TextView) rowView.findViewById(R.id.rating);
            holder.address = (TextView) rowView.findViewById(R.id.address);
            rowView.setTag(holder);
        } else {
            holder = (ViewHolder) rowView.getTag();
        }
        holder.image.setImageResource(placeInfo[i].getmImageResourceId());
        holder.title.setText(placeInfo[i].getName());
        holder.rating.setText(placeInfo[i].getRating());
        holder.address.setText(placeInfo[i].getAddress());
        return rowView;
    }

    public class ViewHolder {
        TextView title;
        TextView rating;
        ImageView image;
        TextView address;
    }

    public void setData(place[] placeInfo) {
        this.placeInfo = placeInfo;
    }
}

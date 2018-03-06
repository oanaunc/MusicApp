package com.oanaunciuleanu.musicapp;


import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artists> {
    public ArtistAdapter(Activity context, ArrayList<Artists> artists) {
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_list, parent, false);

        }

        Artists currentArtist = getItem(position);


        TextView artistTextView = listItemView.findViewById(R.id.artistName);
        artistTextView.setText(currentArtist.getArtistName());
        artistTextView.setTextColor(Color.WHITE);
        artistTextView.setTextSize(15);
        artistTextView.setGravity(Gravity.CENTER);
        return listItemView;
    }
}

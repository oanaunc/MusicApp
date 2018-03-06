package com.oanaunciuleanu.musicapp;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(Activity context, ArrayList<Track> tracks) {
        super(context, 0, tracks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.track_list, parent, false);
        }

        Track currentTrack = getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.songName);
        songTextView.setText(currentTrack.getSongName());
        songTextView.setTextColor(Color.WHITE);
        songTextView.setTextSize(18);

        TextView artistTextView = listItemView.findViewById(R.id.artistName);
        artistTextView.setText(currentTrack.getArtistName());
        artistTextView.setTextColor(Color.parseColor("#bc486b"));
        artistTextView.setTypeface(null, Typeface.BOLD);


        TextView durationTextView = listItemView.findViewById(R.id.trackDuration);
        durationTextView.setText(currentTrack.getDuration());
        durationTextView.setTextColor(Color.parseColor("#bc486b"));

        return listItemView;
    }

}

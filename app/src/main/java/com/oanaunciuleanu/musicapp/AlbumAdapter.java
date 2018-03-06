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

public class AlbumAdapter extends ArrayAdapter<Album> {
    public AlbumAdapter(Activity context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list, parent, false);
        }

        Album currentAlbum = getItem(position);

        TextView albumTextView = listItemView.findViewById(R.id.albumName);
        albumTextView.setText(currentAlbum.getAlbumName());
        albumTextView.setTextColor(Color.WHITE);
        albumTextView.setTextSize(18);

        TextView artistTextView = listItemView.findViewById(R.id.artistName);
        artistTextView.setText(currentAlbum.getArtistName());
        artistTextView.setTextColor(Color.parseColor("#bc486b"));
        artistTextView.setTypeface(null, Typeface.BOLD);

        TextView genreTextView = listItemView.findViewById(R.id.genreName);
        genreTextView.setText(currentAlbum.getGenre());
        genreTextView.setTextColor(Color.parseColor("#bc486b"));
        genreTextView.setTypeface(null, Typeface.ITALIC);

        return listItemView;
    }
}

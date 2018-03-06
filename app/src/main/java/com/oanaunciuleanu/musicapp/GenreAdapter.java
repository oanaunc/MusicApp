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


public class GenreAdapter extends ArrayAdapter<Genre> {
    public GenreAdapter(Activity context, ArrayList<Genre> genres) {
        super(context, 0, genres);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.genres_list, parent, false);


        }

        Genre currentGenre = getItem(position);

        TextView genreTextView = listItemView.findViewById(R.id.genreName);
        genreTextView.setText(currentGenre.getGenre());
        genreTextView.setTextColor(Color.WHITE);
        genreTextView.setTextSize(15);
        genreTextView.setGravity(Gravity.CENTER);
        return listItemView;
    }
}

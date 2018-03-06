package com.oanaunciuleanu.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Link the second button
        TextView albums = findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Link the fourth button
        TextView genres = findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(ArtistsActivity.this, GenresActivity.class);
                startActivity(genresIntent);
            }
        });

        // Link the third button
        TextView artists = findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(ArtistsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Link the first button
        TextView tracks = findViewById(R.id.tracks);
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(tracksIntent);
            }
        });


        // Create a list of artists
        ArrayList<Artists> artistsArrayList = new ArrayList<Artists>();
        artistsArrayList.add(new Artists("The Beatles"));
        artistsArrayList.add(new Artists("Led Zeppelin"));
        artistsArrayList.add(new Artists("The Rolling Stones"));
        artistsArrayList.add(new Artists("Pink Floyd"));
        artistsArrayList.add(new Artists("Queen"));
        artistsArrayList.add(new Artists("The Who"));
        artistsArrayList.add(new Artists("AC/DC"));
        artistsArrayList.add(new Artists("Jimi Hendrix"));
        artistsArrayList.add(new Artists("The Doors"));
        artistsArrayList.add(new Artists("Nirvana"));
        artistsArrayList.add(new Artists("Eagles"));
        artistsArrayList.add(new Artists("Metallica"));
        artistsArrayList.add(new Artists("Aerosmith"));
        artistsArrayList.add(new Artists("Guns N' Roses"));
        artistsArrayList.add(new Artists("Black Sabbath"));
        artistsArrayList.add(new Artists("U2"));
        artistsArrayList.add(new Artists("David Bowie"));
        artistsArrayList.add(new Artists("The Beach Boys"));
        artistsArrayList.add(new Artists("Van Halen"));
        artistsArrayList.add(new Artists("Bob Dylan"));
        artistsArrayList.add(new Artists("Eric Clapton"));
        artistsArrayList.add(new Artists("Red Hot Chili Peppers"));
        artistsArrayList.add(new Artists("The Police"));
        artistsArrayList.add(new Artists("Deep Purple"));



        ArtistAdapter adapter = new ArtistAdapter(this, artistsArrayList);
        GridView gridView = findViewById(R.id.grid);
        gridView.setAdapter(adapter);


    }
}

package com.oanaunciuleanu.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    // Link the second button
        TextView albums = findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Link the fourth button
        TextView genres = findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);
                startActivity(genresIntent);
            }
        });

        // Link the third button
        TextView artists = findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Link the first button
        TextView tracks = findViewById(R.id.tracks);
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksIntent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(tracksIntent);
            }
        });


        // Create a list of tracks
        ArrayList<Track> trackArrayList = new ArrayList<Track>();
        trackArrayList.add(new Track("Dream On", "Aerosmith", "4:28"));
        trackArrayList.add(new Track("More Than a Feeling", "Boston", "4:44"));
        trackArrayList.add(new Track("Rock and Roll All Nite", "Kiss", "2:49"));
        trackArrayList.add(new Track("Welcome to the Machine", "Pink Floyd", "7:31"));
        trackArrayList.add(new Track("Start Me Up", "Rolling Stones", "3:34"));
        trackArrayList.add(new Track("Piano Man", "Billy Joel", "5:40"));
        trackArrayList.add(new Track("You Shook Me All Night Long", "AC/DC", "3:32"));
        trackArrayList.add(new Track("Crazy on You", "Heart", "4:16"));
        trackArrayList.add(new Track("Black Dog", "Led Zeppelin", "4:55"));
        trackArrayList.add(new Track("Paranoid", "Black Sabbath", "2:48"));

        TrackAdapter adapter = new TrackAdapter(this, trackArrayList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}

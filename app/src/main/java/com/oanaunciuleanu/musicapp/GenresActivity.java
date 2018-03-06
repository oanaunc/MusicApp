package com.oanaunciuleanu.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        // Link the second button
        TextView albums = findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(GenresActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Link the fourth button
        TextView genres = findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(GenresActivity.this, GenresActivity.class);
                startActivity(genresIntent);
            }
        });

        // Link the third button
        TextView artists = findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(GenresActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Link the first button
        TextView tracks = findViewById(R.id.tracks);
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksIntent = new Intent(GenresActivity.this, MainActivity.class);
                startActivity(tracksIntent);
            }
        });


        // Create a list of music genres
        ArrayList<Genre> genreArrayList = new ArrayList<Genre>();
        genreArrayList.add(new Genre("Art Punk"));
        genreArrayList.add(new Genre("Alternative Rock"));
        genreArrayList.add(new Genre("College Rock"));
        genreArrayList.add(new Genre("Crossover Thrash"));
        genreArrayList.add(new Genre("Crust Punk"));
        genreArrayList.add(new Genre("Experimental Rock"));
        genreArrayList.add(new Genre("Folk Punk"));
        genreArrayList.add(new Genre("Goth / Gothic Rock"));
        genreArrayList.add(new Genre("Grunge"));
        genreArrayList.add(new Genre("Hardcore Punk"));
        genreArrayList.add(new Genre("Hard Rock"));
        genreArrayList.add(new Genre("Indie Rock"));
        genreArrayList.add(new Genre("Hard Rock"));
        genreArrayList.add(new Genre("Metal"));
        genreArrayList.add(new Genre("Psychedelic"));
        genreArrayList.add(new Genre("Environmental"));
        genreArrayList.add(new Genre("Ambient"));
        genreArrayList.add(new Genre("Lounge"));
        genreArrayList.add(new Genre("Techno"));
        genreArrayList.add(new Genre("Trance"));
        genreArrayList.add(new Genre("Electroswing"));
        genreArrayList.add(new Genre("Modern Composition"));
        genreArrayList.add(new Genre("Minimalism"));
        genreArrayList.add(new Genre("High Classical"));
        genreArrayList.add(new Genre("Baroque"));
        genreArrayList.add(new Genre("Classic Blues"));
        genreArrayList.add(new Genre("Electric Blues"));


        GenreAdapter adapter = new GenreAdapter(this, genreArrayList);
        GridView gridView = findViewById(R.id.grid3);
        gridView.setAdapter(adapter);



    }
}

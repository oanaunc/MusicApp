package com.oanaunciuleanu.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // Link the second button
        TextView albums = findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(AlbumsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Link the fourth button
        TextView genres = findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(AlbumsActivity.this, GenresActivity.class);
                startActivity(genresIntent);
            }
        });

        // Link the third button
        TextView artists = findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(AlbumsActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Link the first button
        TextView tracks = findViewById(R.id.tracks);
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tracksIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(tracksIntent);
            }
        });


        // Create a list of albums
        ArrayList<Album> albumsArrayList = new ArrayList<Album>();
        albumsArrayList.add(new Album("Thriller", "Michael Jackson", "Pop, Rock, R&B"));
        albumsArrayList.add(new Album("Back in Black", "AC/DC", "Hard rock"));
        albumsArrayList.add(new Album("The Dark Side of the Moon", "Pink Floyd", "Progressive rock"));
        albumsArrayList.add(new Album("Bat Out of Hell", "Meat Loaf", "Hard rock, Progressive rock"));
        albumsArrayList.add(new Album("The Bodyguard", "Whitney Houston", "R&B, Soul, Pop, Soundtrack"));
        albumsArrayList.add(new Album("Their Greatest Hits (1971–1975)", "Eagles", "Rock, Soft rock, Folk rock"));
        albumsArrayList.add(new Album("Led Zeppelin IV", "Led Zeppelin", "Hard rock, Heavy metal, Folk"));
        albumsArrayList.add(new Album("Saturday Night Fever", "Bee Gees", "Disco"));
        albumsArrayList.add(new Album("Rumours", "Fleetwood Mac", "Soft rock"));
        albumsArrayList.add(new Album("Come On Over", "Shania Twain", "Country, Pop"));

        AlbumAdapter adapter = new AlbumAdapter(this, albumsArrayList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}

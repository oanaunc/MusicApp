package com.oanaunciuleanu.musicapp;


public class Album {
    private String albumName;
    private String artistName;
    private String genre;

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getGenre() {
        return genre;
    }

    public Album(String albumName, String artistName, String genre) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.genre = genre;

    }
}

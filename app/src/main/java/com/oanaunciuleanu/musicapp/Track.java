package com.oanaunciuleanu.musicapp;


public class Track {
    private String songName;
    private String artistName;
    private String duration;

    public Track(String songName, String artistName, String duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getDuration() {
        return duration;
    }
}

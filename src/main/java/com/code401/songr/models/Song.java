package com.code401.songr.models;

import javax.persistence.*;

@Entity
public class Song {
    String title;
    int length;
    int trackNumber;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    long id;

    @ManyToOne
    Album album;

    public Song() {}

    public Song(String title, int length, int trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public String getAlbumTitle() {
        return album.title;
    }
}

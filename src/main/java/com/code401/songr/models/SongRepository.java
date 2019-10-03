package com.code401.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SongRepository extends JpaRepository<Song, Long> {
    Song findSongByTitleAndAlbumId(String title, long AlbumId);
}

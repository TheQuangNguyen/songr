package com.code401.songr.controllers;

import com.code401.songr.models.Album;
import com.code401.songr.models.AlbumRepository;
import com.code401.songr.models.Song;
import com.code401.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.persistence.NonUniqueResultException;
import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getSongsPage(Model m) {
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "songs";
    }

    @PostMapping("/songs")
    public RedirectView addSongs(String title, int length, int trackNumber, String albumTitle, Model m) {
        try {
            Album album = albumRepository.findAlbumByTitle(albumTitle);
            songRepository.findSongByTitleAndAlbumId(title, album.id);
            Song song = new Song(title, length, trackNumber, album);
            songRepository.save(song);
            return new RedirectView("/songs");
        } catch(NonUniqueResultException e) {
            m.addAttribute("message", "Song already exist in your storage");
            return new RedirectView("/error");
        }
    }
}
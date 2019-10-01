package com.code401.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumsController {

    Album[] albums = new Album[3];
    Album album1 = new Album("Map of the Soul: Persona",
                            "BTS",
                            7,
                            26,
                            "https://images-na.ssl-images-amazon.com/images/I/51wUYZ1HYmL._SY355_.jpg");
    Album album2 = new Album("24K Magic",
                            "Bruno Mars",
                            9,
                            33,
                            "https://upload.wikimedia.org/wikipedia/en/2/2b/Bruno_Mars_-_24K_Magic_%28Official_Album_Cover%29.png");
    Album album3 = new Album("Westlife",
                            "Westlife",
                            17,
                            51,
                            "https://upload.wikimedia.org/wikipedia/en/a/ae/Westlifewestlife.jpg");

    @GetMapping("/albums")
    public String getAlbumsPage(Model m) {
        albums[0] = album1;
        albums[1] = album2;
        albums[2] = album3;
        m.addAttribute("albums", albums);
        return "albums";
    }
}

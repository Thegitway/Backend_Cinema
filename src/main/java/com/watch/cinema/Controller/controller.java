package com.watch.cinema.Controller;

import com.watch.cinema.Model.Cinema;
import com.watch.cinema.Model.Ville;
import com.watch.cinema.Repository.CinemaRepository;
import com.watch.cinema.Repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
public class controller {

    @Autowired
    CinemaRepository cinemaRepository;

    @Autowired
    VilleRepository villeRepository;

    @CrossOrigin(origins = "*")
    @GetMapping(path="/cinema")
    public List<Cinema> getCinema()
    {
        return cinemaRepository.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path="/ville")
    public List<Ville> getVille()
    {
        return villeRepository.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/cinema")
    public Cinema AddCinema(Cinema cinema)
    {
       return cinemaRepository.save(cinema);
    }

}

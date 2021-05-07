package com.watch.cinema.Controller;

import com.watch.cinema.Model.Cinema;
import com.watch.cinema.Repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    CinemaRepository cinemaRepository;

    @GetMapping(path="/cinema")
    public List<Cinema> getCinema()
    {
        return cinemaRepository.findAll();
    }

    @PostMapping(path="/cinema")
    public Cinema AddCinema(Cinema cinema)
    {
       return cinemaRepository.save(cinema);
    }

}

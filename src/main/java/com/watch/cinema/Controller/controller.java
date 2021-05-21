package com.watch.cinema.Controller;

import com.watch.cinema.Model.Cinema;
import com.watch.cinema.Model.Ville;
import com.watch.cinema.Repository.CinemaRepository;
import com.watch.cinema.Repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(path="/villeFirst")
    public Ville getFistVille()
    {
        return villeRepository.findAll().get(0);
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/cinemaVille")
    public List<Cinema> getCinemasByVille(Ville ville,@RequestParam(name="page",defaultValue="0") int page,
                                          @RequestParam(name="size",defaultValue="5")int size)
    {
        Page<Cinema> cinemasPage= cinemaRepository.findCinemaByVille(ville, PageRequest.of(page,size));
        return  cinemasPage.getContent();

    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/cinema")
    public Cinema AddCinema(Cinema cinema)
    {
       return cinemaRepository.save(cinema);
    }

}

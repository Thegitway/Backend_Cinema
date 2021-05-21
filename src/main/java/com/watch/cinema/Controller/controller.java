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
@CrossOrigin(origins = "*")
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
    @GetMapping(path="/cinemaVille/{id}")
    public List<Cinema> getCinemasByVille(@PathVariable Long id)
    {
        //Ville ville=new Ville();ville.setId(id);
        //Page<Cinema> cinemasPage= cinemaRepository.findCinemaByVille(ville, PageRequest.of(page,size));
        List<Cinema> cinemas=cinemaRepository.findCinemaByVilleId(id);
        return  cinemas;
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/cinema")
    public Cinema AddCinema(Cinema cinema)
    {
       return cinemaRepository.save(cinema);
    }

}

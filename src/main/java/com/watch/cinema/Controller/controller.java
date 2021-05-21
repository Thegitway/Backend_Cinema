package com.watch.cinema.Controller;

import com.watch.cinema.Model.Cinema;
import com.watch.cinema.Model.Film;
import com.watch.cinema.Model.Ville;
import com.watch.cinema.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class controller {

    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private VilleRepository villeRepository;
    @Autowired
    private SalleRepository salleRepository;
    @Autowired
    private PlaceRepository placeRepository;
    @Autowired
    private ProjectionRepository proRepository;
    @Autowired
    private SeanceRepository seanceRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    @GetMapping(path="/cinema")
    public List<Cinema> getCinema()
    {
        return cinemaRepository.findAll();
    }

    @GetMapping(path="/ville")
    public List<Ville> getVille()
    {
        return villeRepository.findAll();
    }

    @GetMapping(path="/villeFirst")
    public Ville getFistVille()
    {
        return villeRepository.findAll().get(0);
    }

    @GetMapping(path="/cinemaVille/{id}")
    public List<Cinema> getCinemasByVille(@PathVariable Long id)
    {
        //Ville ville=new Ville();ville.setId(id);
        //Page<Cinema> cinemasPage= cinemaRepository.findCinemaByVille(ville, PageRequest.of(page,size));
        List<Cinema> cinemas=cinemaRepository.findCinemaByVilleId(id);
        return  cinemas;
    }

    @GetMapping(path="/film")
    public List<Film> getAllFilm()
    {
        return  filmRepository.findAll();
    }


    @PostMapping(path="/cinema")
    public Cinema AddCinema(Cinema cinema)
    {
       return cinemaRepository.save(cinema);
    }

}

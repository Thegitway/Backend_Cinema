package com.watch.cinema.Controller;

import com.watch.cinema.Model.*;
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
    private TicketRepository ticketRepository;
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
        List<Cinema> cinemas=cinemaRepository.findCinemaByVilleId(id);
        return  cinemas;
    }

    @GetMapping(path="/projectionFilmSeance/{id}")
    public List<ProjectionFilm> getProSeance(@PathVariable Long id)
    {
        List<ProjectionFilm> pros=proRepository.findProjectionFilmBySeanceId(id);
        return  pros;
    }

    @GetMapping(path="/seanceSalle/{id}")
    public List<Seance> getSeanceSalle(@PathVariable Long id)
    {
        List<Seance> seances=seanceRepository.findSeanceBySalleId(id);
        return seances;
    }

    @GetMapping(path="/salleCinema/{id}")
    public List<Salle> getSalleCinema(@PathVariable Long id)
    {
        List<Salle> salles=salleRepository.findSalleByCinemaId(id);
        return salles;
    }

    @GetMapping(path="/film")
    public List<Film> getAllFilm()
    {
        return  filmRepository.findAll();
    }

    @GetMapping(path="/seance")
    public List<Seance> getAllSeacne()
    {
        return  seanceRepository.findAll();
    }

    @GetMapping(path="/salle")
    public List<Salle> getAllSalle()
    {
        return  salleRepository.findAll();
    }

    @GetMapping(path="/place")
    public List<Place> getAllPlace()
    {
        return  placeRepository.findAll();
    }

    @GetMapping(path="/ticket")
    public List<Ticket> getAllTicket()
    {
        return  ticketRepository.findAll();
    }

    @GetMapping(path="/projectionFilm")
    public List<ProjectionFilm> getAllProjection()
    {
        return  proRepository.findAll();
    }


    @PostMapping(path="/cinema")
    public Cinema AddCinema(Cinema cinema)
    {
       return cinemaRepository.save(cinema);
    }

}

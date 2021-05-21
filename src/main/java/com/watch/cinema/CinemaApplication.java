package com.watch.cinema;

import com.watch.cinema.Model.*;
import com.watch.cinema.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class CinemaApplication implements CommandLineRunner {
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
    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        try {
            List<Salle> salles=null;
            List<Categorie> categories=new ArrayList<Categorie>();
            categories.add(new Categorie(null,"Action",null));
            filmRepository.save(new Film(null,"Spider-man",2,"Sam Raimi","The " +
                    "fictional character Spider-Man, a comic book superhero " +
                    "created by Stan Lee and Steve Ditko and featured in Marvel Comics publications," +
                    " has appeared as a main character in multiple " +
                    "theatrical and made-for-television films.",
                    "https://firebasestorage.googleapis.com/v0/b/cinema-4ef8e.appspot.com/o/220px-Spider-Man2002Poster.jpg?alt=media&token=588168df-5825-45ff-82a6-ed0e5e3772db",
                    new Date(2000,11,10),null));
            filmRepository.save(new Film(null,"Super-man",2,"Jerry Siegel","The " +
                    "Superman is a fictional character who first appeared in American comic books published by DC Comics. The character was created by writer Jerry Siegel and artist Joe Shuster.",
                    "https://firebasestorage.googleapis.com/v0/b/cinema-4ef8e.appspot.com/o/supe.jpg?alt=media&token=a7d77197-83f8-472e-993c-3a7b684254d7",
                    new Date(1000, Calendar.MARCH,30),categories));

            Ville ville=new Ville(null,"Rabat",31,7,1);
            villeRepository.save(ville);
            Cinema cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
            ville=new Ville(null,"Casablanca",31,7,1);
            villeRepository.save(ville);
            cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
            cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
            cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
            cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);



             ville=new Ville(null,"Marrakech",31,7,1);
            villeRepository.save(ville);
            cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
             cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
             ville=new Ville(null,"Agadir",31,7,1);
            villeRepository.save(ville);
             cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
             ville=new Ville(null,"Tanger",31,7,1);
            villeRepository.save(ville);
             cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
            cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
             cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
             cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
             cinema=new Cinema(null,"Mega",31,7,1,10,ville,null);
            cinemaRepository.save(cinema);
            cinemaRepository.save(new Cinema(null,"Mega",31,7,1,10,ville,null));

            /*List<Cinema> cinemas=new ArrayList<Cinema>();
            cinemas.add(cinema);*/

            System.out.println("All GOOD !");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}

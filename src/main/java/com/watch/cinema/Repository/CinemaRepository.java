package com.watch.cinema.Repository;

import com.watch.cinema.Model.Cinema;
import com.watch.cinema.Model.Ville;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    Page<Cinema> findCinemaByVille(Ville ville,Pageable pageable);
    List<Cinema> findCinemaByVilleId(Long VilleId);
}

package com.watch.cinema.Repository;

import com.watch.cinema.Model.Salle;
import com.watch.cinema.Model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle,Long> {
    List<Salle> findSalleByCinemaId(Long CinemaId);

}

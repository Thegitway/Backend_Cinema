package com.watch.cinema.Repository;

import com.watch.cinema.Model.ProjectionFilm;
import com.watch.cinema.Model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeanceRepository extends JpaRepository<Seance,Long> {
    List<Seance> findSeanceBySalleId(Long SalleId);

}

package com.watch.cinema.Repository;

import com.watch.cinema.Model.Cinema;
import com.watch.cinema.Model.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectionRepository extends JpaRepository<ProjectionFilm,Long> {
    List<ProjectionFilm> findProjectionFilmBySeanceId(Long SeanceId);

}

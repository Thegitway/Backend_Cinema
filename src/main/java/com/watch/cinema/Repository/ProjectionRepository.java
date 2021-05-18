package com.watch.cinema.Repository;

import com.watch.cinema.Model.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectionRepository extends JpaRepository<ProjectionFilm,Long> {
}

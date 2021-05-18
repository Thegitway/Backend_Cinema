package com.watch.cinema.Repository;

import com.watch.cinema.Model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film,Long> {
}

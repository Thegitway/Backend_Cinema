package com.watch.cinema.Repository;

import com.watch.cinema.Model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

}

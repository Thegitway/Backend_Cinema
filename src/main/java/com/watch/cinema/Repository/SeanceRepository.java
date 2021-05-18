package com.watch.cinema.Repository;

import com.watch.cinema.Model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance,Long> {
}

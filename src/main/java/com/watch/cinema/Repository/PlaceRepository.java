package com.watch.cinema.Repository;

import com.watch.cinema.Model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place,Long> {
}

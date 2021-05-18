package com.watch.cinema.Repository;

import com.watch.cinema.Model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends
        JpaRepository<Categorie,Long> {
}
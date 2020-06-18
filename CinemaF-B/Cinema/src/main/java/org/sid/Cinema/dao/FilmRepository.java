package org.sid.Cinema.dao;


import org.sid.Cinema.entities.Cinema;
import org.sid.Cinema.entities.Film;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface FilmRepository extends JpaRepository<Film,Long> {
    public Page<Film> findByTitreContains(String kw , Pageable pageable );
}

package com.seasia.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seasia.movie.model.Movie;
 
@Repository
public interface MovieRepository
        extends JpaRepository<Movie, Long> {
 
}

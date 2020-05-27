package com.seasia.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seasia.movie.model.Category;
 
@Repository
public interface CategoryRepository
        extends JpaRepository<Category, Long> {
 
}

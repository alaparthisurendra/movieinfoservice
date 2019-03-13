package com.movieinfoservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieinfoservices.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}

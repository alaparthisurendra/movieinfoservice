package com.movieinfoservices.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfoservices.model.Movie;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		return new Movie("1234","sreemanthudu");
		
	}

}

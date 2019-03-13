package com.movieinfoservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfoservices.model.Movie;
import com.movieinfoservices.services.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") Integer mid) {
		Movie movies = movieService.getMovieBYId(mid);
		if (movies == null) {
			System.out.println("movie information not avilable");
		}
		return movies;

	}

	@PostMapping("/add")
	public Movie addMovie(@RequestBody Movie movies) {
		Movie addMovie = movieService.addMovie(movies);
		return addMovie;

	}

	@GetMapping("/all")
	public List<Movie> getAllMovies() {
		List<Movie> allMovies = movieService.getAllMovies();
		if (allMovies == null) {
			System.out.println("movie information not avilable");
		}
		return allMovies;

	}

	@PutMapping("/{movieId}")
	public Movie updateMovie(@PathVariable("movieId") Integer mid, @RequestBody Movie movie) {
		Movie updateMovie = movieService.updateMovie(mid, movie);
		return updateMovie;

	}

}

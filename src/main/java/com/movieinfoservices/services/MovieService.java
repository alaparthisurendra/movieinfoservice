package com.movieinfoservices.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieinfoservices.model.Movie;
import com.movieinfoservices.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public Movie getMovieBYId(Integer mid)
	{
		 return movieRepository.getOne(mid);
	}
	
	public List<Movie> getAllMovies()
	{
		List<Movie> allMovies=new ArrayList<>();
		movieRepository.findAll().forEach(allMovies::add);
		return allMovies;	
	}
	
	public void delete(Integer mid)
	{
		movieRepository.deleteById(mid);
	}
	
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public Movie updateMovie(Integer mid, Movie movie)
	{
		movie.setMovieId(mid);
		return movieRepository.save(movie);
	}

}

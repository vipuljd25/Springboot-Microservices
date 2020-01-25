package com.springboot.microservice.movieservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.movieservice.model.Movie;

@RestController
@RequestMapping("/movieService")
public class MovieResource {

	@RequestMapping("/getMovie/{movieId}")
	public Movie getMovie(@PathVariable("movieId")String movieId) {
		return new Movie(movieId, "movieName", "12:90 AM");
	}
	
	
}

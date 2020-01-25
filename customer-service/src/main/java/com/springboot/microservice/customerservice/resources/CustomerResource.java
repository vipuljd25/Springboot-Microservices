package com.springboot.microservice.customerservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.microservice.customerservice.model.Movie;
import com.springboot.microservice.customerservice.model.Rating;

@RestController
@RequestMapping("/customer")
public class CustomerResource {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{movieId}")
	public Movie bookMovie(@PathVariable("movieId") String movieId) {
		Rating rating = restTemplate.getForObject("http://review-service/review/getReview/"+movieId, Rating.class);
		
		Movie movie = restTemplate.getForObject("http://movie-service/movieService/getMovie/"+movieId, Movie.class);
		movie.setRating(rating.getRating());
		return movie;
	}
}

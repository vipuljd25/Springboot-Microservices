package com.springboot.microservice.reviewservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.reviewservice.model.Rating;

@RestController
@RequestMapping("/review")
public class ReviewResource {

	@RequestMapping("/getReview/{movieId}")
	public Rating getReview(@PathVariable("movieId")String movieId) {
		
		return new Rating(movieId, "Awesome movie:::");
		
	}
}

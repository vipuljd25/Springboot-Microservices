package com.springboot.microservice.customerservice.model;

public class Movie {

	private String movieId;
	private String movieName;
	private String movieTime;
	private String rating;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(String movieId, String movieName, String movieTime,String rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.rating= rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
}

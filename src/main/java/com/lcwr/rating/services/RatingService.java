package com.lcwr.rating.services;

import java.util.List;

import com.lcwr.rating.entities.Rating;

public interface RatingService {
	
	//create
	Rating create(Rating rating);
	

	//get all rating
	List<Rating> getRatings();
	
	
	//getall ratings by user id
	List<Rating> getRatingsByUserId(String userId);
	
	
	//getall ratings by hotel id
	List<Rating> getRatingsByHotelId(String hotelId);
}

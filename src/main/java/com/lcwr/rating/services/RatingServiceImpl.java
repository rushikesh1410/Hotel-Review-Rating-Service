package com.lcwr.rating.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwr.rating.entities.Rating;
import com.lcwr.rating.exceptions.ResourceNotFoundException;
import com.lcwr.rating.repositories.RatingRepo;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepo ratingRepo;
	
	@Override
	public Rating create(Rating rating) {
		
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		// TODO Auto-generated method stub
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingsByUserId(String userId) {
		 
		return ratingRepo.findByUserId(userId) ;
	}

	@Override
	public List<Rating> getRatingsByHotelId(String hotelId) {
		 
		return ratingRepo.findByHotelId(hotelId) ;
	}

}

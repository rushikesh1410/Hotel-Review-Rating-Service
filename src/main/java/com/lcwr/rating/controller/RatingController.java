package com.lcwr.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwr.rating.entities.Rating;
import com.lcwr.rating.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	// create rating

	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {

		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));

	}
	// get all rating

	@GetMapping
	public ResponseEntity<List<Rating>> getAllRating() {
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatings());

	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingByUserId(@PathVariable String userId) {
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingsByUserId(userId));

	}	

	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingHotelId(@PathVariable String hotelId) {
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingsByHotelId(hotelId));

	}

}

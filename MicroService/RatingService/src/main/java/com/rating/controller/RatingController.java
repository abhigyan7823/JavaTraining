package com.rating.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entities.Rating;
import com.rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    Logger logger = LoggerFactory.getLogger(RatingController.class);
	
	@Autowired
    private RatingService ratingService;
    
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getRatings() {
    	List<Rating> tempRating = ratingService.getRatings();
    	logger.info("Inside all get Ratings Methods of RatingController***********************************");
        return ResponseEntity.ok(tempRating);
    }

    @GetMapping("/users/{userId}")
  @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId) {
    	List<Rating> tempRating = ratingService.getRatingByUserId(userId);
    	logger.info("Inside get Ratings By User ID Method of RatingController******************************");
        return ResponseEntity.ok(tempRating);
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId) {
    	List<Rating> tempRating = ratingService.getRatingByHotelId(hotelId);
    	logger.info("Inside get Ratings By Hotel ID Method of RatingController******************************");
        return ResponseEntity.ok(tempRating);
    }


}

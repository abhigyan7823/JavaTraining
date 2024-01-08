package com.rating.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entities.Rating;
import com.rating.repository.RatingRepository;
import com.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	Logger logger = LoggerFactory.getLogger(RatingServiceImpl.class);
	
    @Autowired
    private RatingRepository repository;

    @Override
    public Rating create(Rating rating) {
        return repository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
    	List<Rating> tempRating = repository.findAll();
    	logger.info("Rating serviceImpl is called +++++++++++++++++++++++++++++++++++++++++"+tempRating.toString());
    	
        return tempRating;
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
    	List<Rating> tempRating = repository.findByUserId(userId);
    	logger.info("Rating serviceImpl is called +++++++++++++++++++++++++++++++++++++++++");
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
    	List<Rating> tempRating = repository.findByHotelId(hotelId);
    	logger.info("Rating serviceImpl is called +++++++++++++++++++++++++++++++++++++++++");
    	return repository.findByHotelId(hotelId);
    }
}
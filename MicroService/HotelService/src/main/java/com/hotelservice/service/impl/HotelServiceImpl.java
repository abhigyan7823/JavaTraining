package com.hotelservice.service.impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.entites.Hotel;
import com.hotelservice.exceptions.ResourceNotFoundException;
import com.hotelservice.repositories.HotelRepository;
import com.hotelservice.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	Logger logger = LoggerFactory.getLogger(HotelServiceImpl.class);
	
	@Override
	public Hotel create(Hotel hotel) {
		String HotelId = UUID.randomUUID().toString();
		hotel.setId(HotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		List<Hotel> hotels = hotelRepository.findAll();
		logger.info("Inside HotelServiceImpl +++++++++++++++++++++"+ hotels.toString());
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		Hotel hotel =  hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with give ID is not Found !!"));
		logger.info("Inside HotelServiceImpl +++++++++++++++++++++"+ hotel.toString());
		return hotel;
	}

}

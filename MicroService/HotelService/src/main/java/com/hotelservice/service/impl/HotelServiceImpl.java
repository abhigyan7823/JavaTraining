package com.hotelservice.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.entites.Hotel;
import com.hotelservice.repositories.HotelRepository;
import com.hotelservice.service.HotelService;
import com.hotelservice.service.exceptions.ResourceNotFoundException;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		String HotelId = UUID.randomUUID().toString();
		hotel.setId(HotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with give ID is not Found !!"));
	}

}

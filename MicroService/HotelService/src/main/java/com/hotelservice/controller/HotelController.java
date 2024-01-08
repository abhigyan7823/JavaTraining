package com.hotelservice.controller;

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

import com.hotelservice.entites.Hotel;
import com.hotelservice.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	Logger logger = LoggerFactory.getLogger(HotelController.class);
	
	@PreAuthorize("hasAuthority('Admin')|| hasAuthority('Normal')")
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.create(hotel));
	}
	
	@GetMapping
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<Hotel>> getAll() {
		List<Hotel> tempHotel = hotelService.getAll();
		logger.info("Controller Method of Hotel **********************************");
		return ResponseEntity.ok(tempHotel);
	}
					
	@PreAuthorize("hasAuthority('SCOPE_internal')")
	@GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
		Hotel tempHotel = hotelService.get(hotelId);
		logger.info("Controller Method of Hotel **********************************");
        return ResponseEntity.status(HttpStatus.OK).body(tempHotel);
    }
	
}

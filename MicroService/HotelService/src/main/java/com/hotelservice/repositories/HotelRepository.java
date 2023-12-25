package com.hotelservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelservice.entites.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {
	
}

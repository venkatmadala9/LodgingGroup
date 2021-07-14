package com.lodging.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepo;
	
	public Optional<Hotel> getHotelById(Long id)
	{
		return hotelRepo.findById(id);
	}
	
	public List<Hotel> getHotels()
	{
		return hotelRepo.findAll();
	}

	public Hotel saveHotel(Hotel hotel)
	{
		return hotelRepo.save(hotel);
	}
}

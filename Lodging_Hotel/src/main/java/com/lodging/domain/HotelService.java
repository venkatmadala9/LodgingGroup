package com.lodging.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepo;
	
	public Hotel getHotelById(Long id)
	{
		return hotelRepo.getById(id);
	}
	
	public List<Hotel> getHotels()
	{
		return hotelRepo.findAll();
	}

}

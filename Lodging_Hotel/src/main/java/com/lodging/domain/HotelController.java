package com.lodging.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@GetMapping("/detail/{id}")
	public Optional<Hotel> getHotelById(@PathVariable("id") String id)
	{
		return hotelService.getHotelById(new Long(id));
	}
	
	@GetMapping("/all")
	public List<Hotel> getHotels()
	{
		return hotelService.getHotels();
	}
	
	@PostMapping("/add")
	public Hotel addHotel(@RequestBody Hotel hotel)
	{
		return hotelService.saveHotel(hotel);
	}

}

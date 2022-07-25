package com.beisbolicos.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beisbolicos.demo.repo.Restaurant;
import com.beisbolicos.demo.services.RestaurantServiceImpl;

@RestController
public class MongoController {
	@Autowired
	RestaurantServiceImpl restaurantService;
	
	@GetMapping(value="/")
	public ResponseEntity <Object> getRestaurants(){
		List<Restaurant> restaurants = restaurantService.getRestaurant();
		ResponseEntity<Object> listRestaurants = new ResponseEntity<>(restaurants, HttpStatus.OK);
		return listRestaurants;
	}
}

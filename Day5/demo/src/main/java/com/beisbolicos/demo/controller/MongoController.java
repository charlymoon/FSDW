package com.beisbolicos.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beisbolicos.demo.repo.Restaurant;
import com.beisbolicos.demo.services.RestaurantService;

@RestController
public class MongoController {
	@Autowired
	RestaurantService restaurantService;
	@GetMapping(value="/restaurant")
	public ResponseEntity <Object> getPeople(){
		List<Restaurant> restaurants = restaurantService.getRestaurant();
		ResponseEntity<Object> listRestaurants = new ResponseEntity<>(restaurants, HttpStatus.OK);
		//for(People item : people) {
		//	listPeople.add(new ResponseEntity<Object>(status))
		//}
		return listRestaurants;
	}
}

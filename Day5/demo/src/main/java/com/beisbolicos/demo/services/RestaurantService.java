package com.beisbolicos.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beisbolicos.demo.repo.Restaurant;
import com.beisbolicos.demo.repo.IRestaurantRepo;

@Service
public class RestaurantService {

	@Autowired
	IRestaurantRepo restaurantRepository;
	public List<Restaurant> getRestaurant(){	
			List<Restaurant> people = (List<Restaurant>)restaurantRepository.findAll();
			return people;
		}
}

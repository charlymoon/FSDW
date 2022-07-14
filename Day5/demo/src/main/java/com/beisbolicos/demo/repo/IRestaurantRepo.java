package com.beisbolicos.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestaurantRepo extends MongoRepository<Restaurant, Long> {
	public List<Restaurant> getRestaurant();
	
}

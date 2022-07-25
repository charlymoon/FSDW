package com.beisbolicos.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface IRestaurantRepo extends MongoRepository<Restaurant, Long> {
	public List<Restaurant> findAll();
	@Query("{'name':?0}")
	public Restaurant findByName();
	
}

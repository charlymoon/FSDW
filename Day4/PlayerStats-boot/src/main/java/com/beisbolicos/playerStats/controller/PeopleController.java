package com.beisbolicos.playerStats.controller;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beisbolicos.playerStats.entity.People;
import com.beisbolicos.playerStats.serviceImpl.PeopleService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@RestController
@SwaggerDefinition(tags = {@Tag (name="Consultas", description="Diferentes consultas para la BDB")})

public class PeopleController {

	@Autowired
	PeopleService peopleService;

	@PostMapping(value = "/people")
	

	public ResponseEntity<Object> createEmployee(@RequestBody People people) {

		peopleService.createPeople(people);
		return new ResponseEntity<Object>("Successfully Saved", HttpStatus.OK);
	}

	@GetMapping(value = "/people/{id}")
	/**
	 * Obtiene los datos generales del jugador de acuerdo a su id
	 * @param id Generalmente las 5 primeras letras del apellido más dos del nombre y dos dígitos de secuencia por colisión
	 * @return Datos generales del jugador o manager
	 */
	@ApiOperation(value = "Queries a people on the Baseball Data Bank",
	              notes = "Queries a people on the Baseball Data Bank")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully got the people", 
					examples = @Example(value = @ExampleProperty(mediaType="application/json",
							value="{\"playerId\":\"allenjo02\","
									+ "\"nameFirst\":\"Johnny\","
									+ "\"nameLast\":\"Allen\","
									+ "\"birthCity\":\"Lenoir\","
									+ "\"birthContry\":\"USA\","
									+ "\"birthDay\":\"30\","
									+ "\"birthMonth\":\"9\","
									+ "\"birthYear\":\"1904\"}"))), 
			@ApiResponse(code = 404, message = "Player or manager not found"), 
			@ApiResponse(code = 400, message = "Missing or invalid request body"), 
			@ApiResponse(code = 500, message = "Internal error")
			}
	)
	public ResponseEntity<Object> getPeople(@PathVariable String id) {

		People people = peopleService.getPeopleById(id);
		return new ResponseEntity<Object>(people, HttpStatus.OK);
	}

	@PutMapping(value = "/people")
	public ResponseEntity<Object> updateEmployee(@RequestBody People people) {

		peopleService.updatePeople(people);
		return new ResponseEntity<Object>("Successfully Updated", HttpStatus.OK);
	}

	@DeleteMapping(value = "/people/{id}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable String id) {

		peopleService.deletePeople(id);
		return new ResponseEntity<Object>("Successfully Deleted", HttpStatus.OK);
	}
	
	@GetMapping(value="/people")
	public ResponseEntity <Object> getPeople(){
		List<People> people = peopleService.getPeople();
		ResponseEntity<Object> listPeople = new ResponseEntity<>(people, HttpStatus.OK);
		//for(People item : people) {
		//	listPeople.add(new ResponseEntity<Object>(status))
		//}
		return listPeople;
	}
	
	@GetMapping(value="/people/{teamId}/{yearId}")
	public ResponseEntity <Object> getPeople(@PathVariable String teamId, @PathVariable int yearId){
		List<People> people = peopleService.getPeople(teamId, yearId);
		ResponseEntity<Object> listPeople = new ResponseEntity<Object>(people, HttpStatus.OK);
		return listPeople;
	}

}
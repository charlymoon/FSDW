package com.beisbolicos.playerStats.serviceImpl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beisbolicos.playerStats.entity.People;
import com.beisbolicos.playerStats.repo.PeopleRepository;
import com.beisbolicos.playerStats.service.IPeopleService;

@Service
public class PeopleService implements IPeopleService {
	@Autowired
	PeopleRepository peopleRepository;

	@Override
	public void createPeople(People employee) {
		peopleRepository.save(employee);
		
	}

	@Override
	public People getPeopleById(String id) {
		People people;
		try {
			people = peopleRepository.getById(id);
		}catch (EntityNotFoundException e){
			people = null;
		}
		return people;
	}

	@Override
	public void updatePeople(People employee) {
		peopleRepository.save(employee);
		
	}

	@Override
	public void deletePeople(String id) {
		peopleRepository.deleteById(id);
		
	}

	@Override
	public List<People> getPeople() {
		List<People> people = peopleRepository.findAll();
		return people;
	}

	public List<People> getPeople(String teamId, int yearId) {
		List<People>people = peopleRepository.findByTeamYear(teamId, yearId);
		return people;
	}

}

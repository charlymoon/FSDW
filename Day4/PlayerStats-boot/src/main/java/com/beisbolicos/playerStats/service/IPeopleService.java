package com.beisbolicos.playerStats.service;

import java.util.List;

import com.beisbolicos.playerStats.entity.People;

public interface IPeopleService {
	public void createPeople(People employee);

	public People getPeopleById(String id);

	public void updatePeople(People employee);

	public void deletePeople(String id);
	
	public List<People> getPeople();

}

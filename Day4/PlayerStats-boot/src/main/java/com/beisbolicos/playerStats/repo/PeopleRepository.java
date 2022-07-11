package com.beisbolicos.playerStats.repo;

import org.springframework.stereotype.Repository;

import com.beisbolicos.playerStats.entity.People;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface PeopleRepository extends JpaRepository<People, String>{

	@Query("select p  from "
			+ "People p, Batting b where p.playerId=b.playerId"
			+ " and b.teamId = ?1 and b.yearId = ?2")
	public List<People> findByTeamYear(String teamId, int yearId);

}

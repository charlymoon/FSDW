package com.beisbolicos.playerStats.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beisbolicos.playerStats.entity.Batting;

public interface BattingRepository extends JpaRepository<Batting, String>
{

}

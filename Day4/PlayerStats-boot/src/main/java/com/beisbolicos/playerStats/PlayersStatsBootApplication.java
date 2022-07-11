package com.beisbolicos.playerStats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class PlayersStatsBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayersStatsBootApplication.class, args);
	}

	@RequestMapping(path = "/")
	public String helloWorld() {
		return "Hello World";
	}
}

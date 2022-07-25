package com.beisbolicos.playerStats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.beisbolicos.**")
public class StarterApplication {


	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

}

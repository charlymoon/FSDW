package com.beisbolicos.playerStats;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(value="/")
	public String helloWorld() {
		return "hello World";
	}
}

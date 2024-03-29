package com.nester.algo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortingAlgoController {
	
	@GetMapping("/hello")
	public String sort(@RequestParam String name) {
		
		return "Hello "+name;
		
	}
	
	
	

}

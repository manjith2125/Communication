package com.microservice.communication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	
	
	@GetMapping("/tagline")
	public String tagLine() {
		
		return "Your Java Stop!";
	}
	
	

}

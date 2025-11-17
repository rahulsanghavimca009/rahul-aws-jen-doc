package com.tops;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@GetMapping("home")
	public 	ResponseEntity<String> home()
	{
		return ResponseEntity.ok("Welcome to Deploy Project by Rahul Sanghavi AWS EC2 Git Jenkins Docker");
	}
}

package com.training.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice1")
public class Controller 
{
	@Autowired
	private Microservice2Client m2c;
	
	@GetMapping("/test")
	public String testMethod()
	{
		return "microservice tested working fine";
	}
	@GetMapping("/micro1")
	public String micro1()
	{
		return "microservice1 is working !!! "+m2c.micro2();
	}
}

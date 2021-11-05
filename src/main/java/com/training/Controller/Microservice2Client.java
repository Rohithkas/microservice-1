package com.training.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MICROSERVICE2")
public interface Microservice2Client 
{
	@GetMapping("/microservice2/micro2")
	public String micro2();
}

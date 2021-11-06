package com.training.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/microservice1")
public class Controller 
{
	@Autowired
	private Microservice2Client m2c;
	 @Autowired
	 private RestTemplate restTemplate;
	@GetMapping("/test")
	public String testMethod()
	{
		return "microservice tested working fine";
	}
	
	@GetMapping("/micro1")
	public String micro1()
	{
		String response="";
		try {
             response = restTemplate.getForObject("http://3.7.37.186:8086/microservice2/micro2",
                    String.class);
        } catch (Exception e) {
            e.printStackTrace();
            response="error";
        }
		return "microservice1 is working !!! "+response;
	}
	@GetMapping("test2")
    public String test2Method() {
        try {
            String response = restTemplate.getForObject("http://65.2.54.38:8086/microservice2/micro2",
                    String.class);
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}

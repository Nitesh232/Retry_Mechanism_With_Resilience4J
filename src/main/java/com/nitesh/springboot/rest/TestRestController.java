package com.nitesh.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class TestRestController {
	
	
	@GetMapping("/m1")
	@Retry(name = "m1")
	public String m1() {
		
		System.out.println("***m1() method called***");
		
		//int x = 10/0;
		
		return "reply from m1() method...";
	}
	
	public String m2(Exception e) {
		return "reply from m2() method...";
	}

}

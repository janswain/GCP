package com.sabre.movieinfoservice.resources;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootApplicationExample {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to GetThere..........";

	}

}

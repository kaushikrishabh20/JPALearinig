package com.rishah.spring.jpa.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JpaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaLearningApplication.class, args);
	}

	@RequestMapping(value="/welcome" , method = RequestMethod.GET)
	public String welome() {
		return "Welcome to jpa learning";
	}
}

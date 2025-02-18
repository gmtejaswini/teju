package org.capgemini.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Value("${message}") //SPEL language
	String msg;
	
	@GetMapping("/welcome")
	public String getMessage()
	{
		return "Hi "+msg;
	}
}

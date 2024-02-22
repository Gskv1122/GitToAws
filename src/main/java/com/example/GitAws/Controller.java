package com.example.GitAws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(value="/Sayit")
	public String get() {
		return "Hello World";
	}

}

package com.example.examenparcial1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String mensaje() {
		return "bienvenido a mi spring";
	}
	
}

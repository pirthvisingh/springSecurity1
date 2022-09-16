package com.spring.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebController {
	
	@GetMapping
	public String homePage() {
		return "<h1>Welcome to Home Page</h1>";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "<h1>Welcome Admin</h1>";
	}
	
	@GetMapping("/user")
	public String userPage() {
		return "<h1>Welcome User</h1>";
	}
	
}

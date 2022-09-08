package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home-Controller");
		return "This is private Page and this page is not allowed to Unauthenticated Users";
	}

}

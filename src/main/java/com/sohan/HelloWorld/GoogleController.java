package com.sohan.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoogleController {
	
	@GetMapping("/google")
	public String google() {
		
		return "google";
	}

}

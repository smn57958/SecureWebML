package com.sohan.HelloWorld;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HandleErrorController implements ErrorController{

	@GetMapping("/error")
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "error";
	}
	
	

}

package com.apple.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "silly";
	}
	
//	// need a controller method to process the HTML form
//	@RequestMapping("/processForm")
//	public String processForm() {
//		return "helloworld";
//	}
}


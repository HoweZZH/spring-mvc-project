package com.apple.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		// the main-menu will be resolved by resolver to /WEB-INF/view/main-menu.jsp
		return "main-menu";
	}
	
}


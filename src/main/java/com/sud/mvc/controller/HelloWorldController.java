package com.sud.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	String message = "Welcome to Spring MVC!";

	@RequestMapping("/hello")
	public ModelAndView showMessage() {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView();
			mv.addObject("message", message);
			mv.addObject("name", "Sudarshan");
			mv.setViewName("helloworld");
		
		return mv;
	}

}

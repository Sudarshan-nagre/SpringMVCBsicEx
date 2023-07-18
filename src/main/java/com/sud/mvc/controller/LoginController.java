package com.sud.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sud.mvc.entity.LoginUser;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login", "command", new LoginUser());
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String logedIn(@ModelAttribute("login")LoginUser user, ModelMap map) {

		if(user.getUserName().equals("Ganesh") && user.getPwd().equals("12345")) {
			map.addAttribute("result","Login Success");
		}else {
			map.addAttribute("result","Login Failed !!");
		}
		return "loginResult";
	}
}

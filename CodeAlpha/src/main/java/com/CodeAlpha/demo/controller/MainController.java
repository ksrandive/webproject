package com.CodeAlpha.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value= "/")
	public String loadPage() {
		return "index";
	}
	
	@RequestMapping(value= "/userlogin")
	public String loginPage() {
		return "user_login";
	}
	
	@RequestMapping(value= "/userresgration")
	public String registrationPage() {
		return "user_registration";
	}
	
	
}

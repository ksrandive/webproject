package com.CodeAlpha.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CodeAlpha.demo.model.User;
import com.CodeAlpha.demo.services.UserServices;

@RestController
@RequestMapping("/api")
public class RestUserController {
	
	@Autowired
	private UserServices userServices;
	
	@RequestMapping(value = "/register_user", method = RequestMethod.POST)
	public ResponseEntity<User> getData(@RequestBody User user){
		this.userServices.register_user(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	
}




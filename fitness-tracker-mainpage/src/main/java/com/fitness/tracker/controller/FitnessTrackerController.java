package com.fitness.tracker.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.tracker.bean.EndUser;
import com.fitness.tracker.service.FitnessTrackerService;

@RestController
public class FitnessTrackerController {
	
	@Autowired
	FitnessTrackerService service;
	
	@RequestMapping("user")
	Principal user(Principal principal) {
		return principal;
	}
	
	@PostMapping("/createUser")
	void createNewUser(@RequestBody EndUser endUser)
	{
		service.createNewUser(endUser);
	}

}

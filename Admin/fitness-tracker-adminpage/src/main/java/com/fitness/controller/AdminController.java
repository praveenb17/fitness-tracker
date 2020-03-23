package com.fitness.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {		
		
		@RequestMapping("/")
		String getMessage() {
			
//			Home Page is yet to be defined
			return "Home Page";
			
		}
		
		@RequestMapping("/users")
		String getMesageForUsers() {
			
//			User Page is yet be defined	
			return "Hello user..";
			
		}
		
		@RequestMapping("/admin")
		String getMessageForAdmin() {
			
//			Admin Page is yet to be defined
			
			return "Admin Page";
					
		}
		
}


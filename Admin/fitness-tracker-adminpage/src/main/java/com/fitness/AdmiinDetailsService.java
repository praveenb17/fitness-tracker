package com.fitness;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class AdmiinDetailsService implements UserDetailsService {
	
	@Autowired
	AdminRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Admin> user = repo.findByUserName(username); 
		
		user.orElseThrow(() -> new UsernameNotFoundException("User not found" + username));
		
		return user.map(AdminDetails::new).get();
		
		
	}
}

package com.fitness.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.tracker.bean.EndUser;
import com.fitness.tracker.dao.FitnessTrackerRepository;

@Service
public class FitnessTrackerService {

	@Autowired
	FitnessTrackerRepository repo;
	
	public void createNewUser(EndUser endUser) {
		repo.save(endUser);
	}
	
}

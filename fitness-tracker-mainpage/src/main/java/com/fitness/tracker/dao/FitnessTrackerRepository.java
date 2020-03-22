package com.fitness.tracker.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fitness.tracker.bean.EndUser;

@Repository
public interface FitnessTrackerRepository extends CrudRepository<EndUser, String>{

	
}

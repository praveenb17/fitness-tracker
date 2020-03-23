package com.fitness;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, String>{
	
	Optional<Admin> findByUserName(String userName);
}



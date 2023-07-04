package com.test.users.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

   
    User findByName(String Name);
    
    List<User> findAll();

	   boolean existsByEmail(String value); 
		
	
}

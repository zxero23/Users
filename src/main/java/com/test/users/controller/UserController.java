package com.test.users.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.users.model.User;
import com.test.users.repository.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
	
	final UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository= userRepository;	
	}

    @GetMapping
    public Map<String, Object> getUserName() {    	
    	userRepository.findAll().forEach(x ->System.out.println(x.getName()));
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("username", authentication.getName());
        userMap.put("error", false);
        return userMap;
    }
    
    
    @GetMapping("/all")
    public List<User> getAllusers(){
    	return userRepository.findAll();
    }
    
    
    
    
}

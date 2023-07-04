package com.test.users.response;

import java.util.HashMap;
import java.util.Map;

import com.test.users.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
	
	private Map<String, Object> responseMap = new HashMap<>();
	

	public UserResponse(User user) {		
		this.responseMap.put("id", user.getId());
		this.responseMap.put("Created", user.getCreated());
		this.responseMap.put("Modified", user.getModified());
		this.responseMap.put("Last Login", user.getLast_login());
		this.responseMap.put("Token", user.getToken());
		this.responseMap.put("is_active", user.isActive());
	}

}

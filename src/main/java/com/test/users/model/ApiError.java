package com.test.users.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ApiError {
	
	private String ErrorMessage;
	private String Code;
	
	public ApiError(String errorMessage, String code) {
		super();
		ErrorMessage = errorMessage;
		Code = code;
	}
	
	

}

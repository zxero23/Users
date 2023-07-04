package com.test.users.exceptions;

import javax.validation.ConstraintViolationException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.test.users.model.ApiError;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	  public ResponseEntity<?> handle(DataIntegrityViolationException exception) {
	        //you will get all javax failed validation, can be more than one
	        //so you can return the set of error messages or just the first message
	        String errorMessage = "El correo ya está registrado";
	       ApiError apiError = new ApiError(errorMessage, "1000");    
	       return new ResponseEntity<>( apiError,null, HttpStatus.BAD_REQUEST);
	  }
	
	@ExceptionHandler
	  public ResponseEntity<?> handle(ConstraintViolationException exception) {
	        //you will get all javax failed validation, can be more than one
	        //so you can return the set of error messages or just the first message
	        String errorMessage = "El correo ya está registrado Constraint";
	       ApiError apiError = new ApiError(errorMessage, "1000");    
	       return new ResponseEntity<>( apiError,null, HttpStatus.BAD_REQUEST);
	  }
	
	
	@ExceptionHandler
	  public ResponseEntity<?> handle(MethodArgumentNotValidException exception) {
	        //you will get all javax failed validation, can be more than one
	        //so you can return the set of error messages or just the first message
	        String errorMessage = exception.getAllErrors().stream().findFirst().get().getDefaultMessage();
	       ApiError apiError = new ApiError(errorMessage, "1000");    
	       return new ResponseEntity<>( apiError,null, HttpStatus.BAD_REQUEST);
	  }

}

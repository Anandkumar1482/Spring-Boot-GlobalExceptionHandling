package com.micro.our;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.micro.exception.CustomEmployeeException;

//4.3 //3.2
//@RestControllerAdvice
public class MyExceptinHandling {

	@ExceptionHandler(value = CustomEmployeeException.class)
	public ResponseEntity<ErrorType> response(CustomEmployeeException ex) {

		return new ResponseEntity<ErrorType>(new ErrorType("not found", new Date(), "Employee", ex.getMessage()),
				HttpStatus.BAD_REQUEST);

	}

}

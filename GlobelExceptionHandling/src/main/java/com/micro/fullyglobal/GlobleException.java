package com.micro.fullyglobal;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.micro.exception.CustomEmployeeException;
import com.micro.our.ErrorType;

@RestControllerAdvice
public class GlobleException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(CustomEmployeeException.class)
	public ResponseEntity<ErrorType> response(CustomEmployeeException ex, ServletWebRequest req) {

		System.out.println(req.getHttpMethod());
		System.out.println(req.getDescription(true));
		return new ResponseEntity<ErrorType>(new ErrorType("not found", new Date(), "Employee", ex.getMessage()),
				HttpStatus.BAD_REQUEST);

	}

}

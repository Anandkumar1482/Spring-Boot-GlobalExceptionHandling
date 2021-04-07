package com.micro.exception;

//@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class CustomEmployeeException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * public CustomEmployeeException() {
	 * 
	 * }
	 */

	public CustomEmployeeException(String message) {
		super(message);
	}

}

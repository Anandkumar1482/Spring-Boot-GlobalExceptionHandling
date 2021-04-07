package com.micro.controller;

//@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class NotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(String s) {
		super(s);
	}

}

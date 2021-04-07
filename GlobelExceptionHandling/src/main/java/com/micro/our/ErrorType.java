package com.micro.our;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrorType {

	private String message;
	private Object Date;
	private String classType;
	private String exception;

}

package com.micro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micro.exception.CustomEmployeeException;
import com.micro.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/find/{eid}", method = RequestMethod.GET)
	public ResponseEntity<Employee> emp(@PathVariable("eid") Integer id) {
		if (id != 5) {
			throw new CustomEmployeeException ("Not Found Exception " + id);
		}
		return ResponseEntity.ok(new Employee(id, "Sri"));

	}
}

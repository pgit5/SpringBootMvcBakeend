package com.nt.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.rest.Entity.Employee;
import com.nt.rest.exception.EmployeeNotFoundException;

@RestController
public class EmployeeRestController {
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getOneEpmployee(@PathVariable Integer id){
		
		if(id!=5) {
			throw new EmployeeNotFoundException("EMPLOYEE::"+id+" NOT EXIST");
		}
		
		//it will return success mesaage and employee data in json formate
		return ResponseEntity.ok(new Employee(id,"preeti"));
		
	}

	
}

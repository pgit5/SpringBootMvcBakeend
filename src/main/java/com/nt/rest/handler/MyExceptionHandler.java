package com.nt.rest.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.rest.Entity.Employee;
import com.nt.rest.errclass.ErrorType;
import com.nt.rest.exception.EmployeeNotFoundException;

@RestControllerAdvice
//@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)
	//@ResponseBody
	public ResponseEntity<ErrorType> handleEmployeeNotFoundExcpem(EmployeeNotFoundException exe ){
		
		return new ResponseEntity<ErrorType>(new ErrorType(exe.getMessage(),
				"NO_EMP_FOUND",
				"DATA_NOT_FOUND_FOR_GIVEN_ID",
		        "Employee",
				"HI"),
				HttpStatus.BAD_REQUEST);
				
		
	}
	
	

}

package com.sbi.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sbi.model.ErrorResponse;
import com.sbi.model.ProductException;

@RestControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorResponse> productNotFoundException(ProductException e){
		ErrorResponse error = new ErrorResponse();
		error.setErrorMsg(e.getMessage());
		error.setDate(LocalDate.now());
		error.setProductId(e.getProductId());
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
	
}

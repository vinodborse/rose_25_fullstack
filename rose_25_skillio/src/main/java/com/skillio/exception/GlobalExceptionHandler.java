package com.skillio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
/*
	@ExceptionHandler(exception = ProductNotFound.class)
	public ResponseEntity<?> productNotFound(ProductNotFound pnf) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(pnf.getMessage());
	}
	
	@ExceptionHandler(exception = RatingException.class)
	public ResponseEntity<?> ratingException(RatingException re) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(re.getMessage());
	}
*/	
	@ExceptionHandler(exception = ResourceNotFound.class)
	public ResponseEntity<?> resourceNotFound(ResourceNotFound rnf) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(rnf.getMessage());
	}
	
}

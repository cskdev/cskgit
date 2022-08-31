package com.exception.com;







import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;


@RestControllerAdvice
@Slf4j
public class AdviceController extends ResponseEntityExceptionHandler {

	@ExceptionHandler({NoSuchElementException.class})
//@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException invalidexception,WebRequest request){
		
		log.error("Failed to find the requested element",invalidexception);
		return buildErrorResponse(invalidexception,HttpStatus.NOT_FOUND,request);
	//return new ResponseEntity<String>("Failed to find the requested element",HttpStatus.NOT_FOUND);
	}

	private ResponseEntity<Object> buildErrorResponse(Exception exception,HttpStatus httpstatus,WebRequest request) {
		// TODO Auto-generated method stub
		return buildErrorResponse(exception,httpstatus,request);
	}
}

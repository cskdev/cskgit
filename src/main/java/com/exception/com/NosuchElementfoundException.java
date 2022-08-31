package com.exception.com;

import org.springframework.web.bind.annotation.ResponseStatus;


public class NosuchElementfoundException extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NosuchElementfoundException(String message) {
		super(message);
	}
	
	

}

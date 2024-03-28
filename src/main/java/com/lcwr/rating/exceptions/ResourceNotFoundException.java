package com.lcwr.rating.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		super("rating not found");
	}

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}

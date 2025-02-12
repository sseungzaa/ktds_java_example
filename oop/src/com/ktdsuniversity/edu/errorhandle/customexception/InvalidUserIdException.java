package com.ktdsuniversity.edu.errorhandle.customexception;

public class InvalidUserIdException extends RuntimeException {
	
	public InvalidUserIdException(String message) {
		super(message);
	}
	
}

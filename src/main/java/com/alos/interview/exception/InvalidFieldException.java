package com.alos.interview.exception;

public class InvalidFieldException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public InvalidFieldException(String message, Object... args) {
		this(String.format(message, args));
	}

	public InvalidFieldException(String message) {
		super(message);
	}

	public InvalidFieldException(Throwable cause) {
		super(cause);
	}

	public InvalidFieldException() {
		super();
	}

}

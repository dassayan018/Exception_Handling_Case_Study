package com.greatlearning.property;

public class InvalidDurationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDurationException() {
		super();
		
	}

	public InvalidDurationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidDurationException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidDurationException(String message) {
		super(message);
	}

	public InvalidDurationException(Throwable cause) {
		super(cause);
	
	}

	
	
}

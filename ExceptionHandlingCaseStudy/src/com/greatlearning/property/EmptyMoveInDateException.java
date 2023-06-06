package com.greatlearning.property;

public class EmptyMoveInDateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyMoveInDateException() {
		super();
		
	}

	public EmptyMoveInDateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public EmptyMoveInDateException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public EmptyMoveInDateException(String message) {
		super(message);
		
	}

	public EmptyMoveInDateException(Throwable cause) {
		super(cause);
		
	}

}

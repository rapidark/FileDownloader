package com.ricky.java.filedownloader.exeception;

public class RetryFailedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RetryFailedException() {
		super();
	}

	public RetryFailedException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RetryFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public RetryFailedException(String message) {
		super(message);
	}

	public RetryFailedException(Throwable cause) {
		super(cause);
	}

}

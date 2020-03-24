package com.co.talenta365.certificacion.exceptions;

	@SuppressWarnings("serial")
	public class CreateUserException extends AssertionError {
		public static final String THE_USER_WAS_NOT_CREATED = "THE USER WAS NOT CREATED";

		public CreateUserException(String message, Throwable cause) {
			super(message, cause);

		}
	}

package com.cinema.exception;

public class JDBCConnectionException extends RuntimeException{

	public JDBCConnectionException(String message) {
		super(message);
	}
}

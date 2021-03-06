package com.myapp;

public class EmployeeException extends Exception {

	private final String exceptionMsg;
	 
	public EmployeeException(String exceptionMsg) {
		super(exceptionMsg);
		this.exceptionMsg = exceptionMsg;
	}
	
	public String getExceptionMsg(){
		return this.exceptionMsg;
	}
	
}

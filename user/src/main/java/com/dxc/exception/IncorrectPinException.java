package com.dxc.exception;

public class IncorrectPinException extends Exception {
	String msg;

	public IncorrectPinException() {
		super();
	}

	public IncorrectPinException(String msg) {
		super(msg);
		
	}
}

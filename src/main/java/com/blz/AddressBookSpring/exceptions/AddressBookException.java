package com.blz.AddressBookSpring.exceptions;

@SuppressWarnings("serial")
public class AddressBookException extends RuntimeException{

	public AddressBookException(String message) {
		super(message);
	}
}
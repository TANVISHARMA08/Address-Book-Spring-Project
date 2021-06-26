package com.blz.AddressBookSpring.DTO;

import lombok.Data;

@Data
public class ResponseDTO {

	private String message;
	private Object data;
	
	public ResponseDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ResponseDTO(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}

}
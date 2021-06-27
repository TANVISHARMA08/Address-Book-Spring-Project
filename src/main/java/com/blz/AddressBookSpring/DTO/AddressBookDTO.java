package com.blz.AddressBookSpring.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class AddressBookDTO {
	
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message= " InValid Name")
	public String name;
    
    @NotEmpty(message="Address Should not be null")
	public String address;
	
	public AddressBookDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public AddressBookDTO() {
		// TODO Auto-generated constructor stub
	}
	
		
}
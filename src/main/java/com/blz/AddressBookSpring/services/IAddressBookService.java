package com.blz.AddressBookSpring.services;

import java.util.List;

import com.blz.AddressBookSpring.DTO.AddressBookDTO;
import com.blz.AddressBookSpring.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int addId);
	
	AddressBookData createAddressBookData( AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(int addId, AddressBookDTO addressBookDTO);
	
	void deleteAddressBookData(int addId);
}
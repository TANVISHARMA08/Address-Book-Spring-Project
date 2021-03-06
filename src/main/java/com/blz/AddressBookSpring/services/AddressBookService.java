package com.blz.AddressBookSpring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blz.AddressBookSpring.AddressBookRepository.AddressBookRepository;
import com.blz.AddressBookSpring.DTO.AddressBookDTO;
import com.blz.AddressBookSpring.exceptions.AddressBookException;
import com.blz.AddressBookSpring.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {
	
	@Autowired
	AddressBookRepository addressBookRepository;
	
	private List<AddressBookData> addressBookList = new ArrayList<>();

	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int addId) {
		return addressBookList.stream()
			.filter(addData -> addData.getAddressBookId() == addId)
			.findFirst()
			.orElseThrow(() -> new AddressBookException("Data not found !! Invalid ID"));
	}

	@Override
	public AddressBookData createAddressBookData( AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(addressBookList.size()+1,addressBookDTO);
		addressBookList.add(addressBookData);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int addId, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = this.getAddressBookDataById(addId);
        addressBookData.setName(addressBookDTO.name);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookList.set(addId-1, addressBookData);
        return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int addId) {
		addressBookList.remove(addId-1);
	}

}
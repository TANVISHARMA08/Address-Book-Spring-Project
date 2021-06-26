package com.blz.AddressBookSpring.AddressBookRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.blz.AddressBookSpring.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Long>{

}
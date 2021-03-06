package com.blz.AddressBookSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressBookSpringProjectApplication.class, args);
	
		log.info("AddressBook app started in {} environment",
				  context.getEnvironment().getProperty("environment"));
		
		log.info("AddressBook DB user is {} ",
				  context.getEnvironment().getProperty("spring.datasource.username"));
	}

}

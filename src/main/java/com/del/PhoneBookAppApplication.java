package com.del;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhoneBookAppApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","5151");
		SpringApplication.run(PhoneBookAppApplication.class, args);
	}

}

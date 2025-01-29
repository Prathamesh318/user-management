package com.example.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementApplication {

	public static void main(String[] args) {
		System.out.println("Application Running Successfully");
		SpringApplication.run(UserManagementApplication.class, args);
	}

}

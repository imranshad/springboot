package com.hurd.Hurd;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;


@SpringBootApplication
@EnableAutoConfiguration(exclude={})
public class HurdApplication {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		SpringApplication.run(HurdApplication.class, args);

	}

}



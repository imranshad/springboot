package com.hurd.Hurd;


import com.hurd.Hurd.data.DbConnection;
import com.hurd.Hurd.data.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;


@SpringBootApplication
@EnableAutoConfiguration(exclude={})
public class HurdApplication {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		new Person("imram","imran.shad@ymail.com");
		new Person("shad","imran.shad@gmail.com");
		new Person("khan","imran.shad@hmail.com");
		SpringApplication.run(HurdApplication.class, args);

	}

}



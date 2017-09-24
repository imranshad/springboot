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
//		DbConnection dbConnection=new DbConnection();
//		System.out.println(dbConnection.getConnection());
		Person person=new Person();
		//person.connection=DbConnection.getConnection();
		//System.out.println(person.ConnectionStatus());
		System.out.println(" Email"+person.getEmail().toString());

		SpringApplication.run(HurdApplication.class, args);

	}

}



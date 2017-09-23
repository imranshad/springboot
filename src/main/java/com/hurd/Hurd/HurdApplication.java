package com.hurd.Hurd;

import com.hurd.Hurd.Controlers.Home;
import com.hurd.Hurd.data.MyRepo;
import com.hurd.Hurd.data.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HurdApplication {
	private static Person pr;
	public static void main(String[] args) {
		pr=new Person();
		SpringApplication.run(HurdApplication.class, args);
		System.out.println(pr.getEmail());



	}

}



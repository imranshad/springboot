package com.hurd.Hurd.Controlers;

import com.hurd.Hurd.data.MyRepo;
import com.hurd.Hurd.data.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by shad on 9/23/17.
 */
@RestController
public class jpa {
    public  static MyRepo repo;
    @RequestMapping("/save")
    public String JPA(){


        repo.save(new Person("imran","imran.shad@ymail.com"));
        repo.save(new Person("shad","imran.shad.khan@gmail.com"));
        repo.save(new Person("zeeshan","imran.shad.khan1@gmail.com"));

        return "Data has been saved successfully.....";
    }
    @RequestMapping("/load")
    public String JPALoad(){

        return "hi";
    }
}

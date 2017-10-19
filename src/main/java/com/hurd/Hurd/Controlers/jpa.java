package com.hurd.Hurd.Controlers;




import com.hurd.Hurd.data.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by shad on 9/23/17.
 */
@RestController
public class jpa {
    private Person person;
    @RequestMapping("/session")
    public String Session()  {



        return "Connection  " ;
    }
    @RequestMapping("/load")
    public String JPALoad() throws SQLException, ClassNotFoundException {


        return "ID :"+person.getEmail();
    }
}

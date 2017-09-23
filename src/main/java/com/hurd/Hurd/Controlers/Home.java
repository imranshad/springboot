
package com.hurd.Hurd.Controlers;

import com.hurd.Hurd.data.MyRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Home {
    @RequestMapping("/")
    public ModelAndView Index(ModelAndView model){
        model=new ModelAndView("index");
        return model;

    }
    @RequestMapping("/users")
    public ModelAndView Login(ModelAndView model){
        model=new ModelAndView("/users/login");

        return model;

    }


}

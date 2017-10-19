
package com.hurd.Hurd.Controlers;

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
    @RequestMapping("/header")
    public ModelAndView Login(ModelAndView model){
        model=new ModelAndView("header");

        return model;

    }
    @RequestMapping("/default")
    public ModelAndView Default(ModelAndView model){
        model=new ModelAndView("default");

        return model;

    }


}

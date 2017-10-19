package com.hurd.Hurd.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by shad on 10/17/17.
 */
@RestController
public class login {
    private ModelAndView model;
    @RequestMapping("/user/login")
    public ModelAndView Login(){
        model=new ModelAndView("/user/login");
        return model;
    }
}

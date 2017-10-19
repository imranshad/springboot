package com.hurd.Hurd.Controlers.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by shad on 9/30/17.
 */
@RestController
public class overview {
    private ModelAndView model;
    @RequestMapping("/overview")
    public ModelAndView Overview(){
        model=new ModelAndView("/spring-boot/overview");
        return model;
    }
}

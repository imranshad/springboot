
package com.hurd.Hurd.Controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Home {
    @RequestMapping("/")
    public ModelAndView Index(ModelAndView model){
        model=new ModelAndView("index");
    model.addObject("msg","hello pakistan");
        return model;

    }


}

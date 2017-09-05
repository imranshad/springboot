
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
        @RequestMapping("/home")
    public ModelAndView Home(ModelAndView model){
        model=new ModelAndView("/pages/home");
    return model;
    }
            @RequestMapping("/about")
    public ModelAndView About(ModelAndView model){
        model=new ModelAndView("/pages/about");
    return model;
    }
            @RequestMapping("/one")
    public ModelAndView One(ModelAndView model){
        model=new ModelAndView("/pages/one");
    return model;
    }
            @RequestMapping("/contact")
    public ModelAndView Two(ModelAndView model){
        model=new ModelAndView("/pages/contact");
    return model;
    }
    @RequestMapping("/three")
    public ModelAndView Three(ModelAndView model){
        model=new ModelAndView("/pages/three");
    return model;
    }
    @RequestMapping("/four")
    public ModelAndView Four(ModelAndView model){
        model=new ModelAndView("/pages/four");
    return model;
    }
    @RequestMapping("five")
    public ModelAndView Five(ModelAndView model){
        model=new ModelAndView("/pages/five");
    return model;
    }
    @RequestMapping("")
    public ModelAndView ContactUs(ModelAndView model){
        model=new ModelAndView("/pages/contactus");
        return model;
    }
}

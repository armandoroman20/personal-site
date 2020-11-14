package mando.codes.personalsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home {

    @GetMapping("/")
    public String mandoHome(){
//        return "mando-home";
        return "mando-codes";
    }
}

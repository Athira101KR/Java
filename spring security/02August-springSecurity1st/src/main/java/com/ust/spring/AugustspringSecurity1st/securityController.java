package com.ust.spring.AugustspringSecurity1st;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class securityController {
    
    @GetMapping("/")
    public String home()
    {
        return ("Wlcome");
    }

    @GetMapping("/user")
    public String user()
    {
        return("welcome user");
    }

    @GetMapping("/admin")
    public String admin()
    {
        return("welcome admin");
    }
} 

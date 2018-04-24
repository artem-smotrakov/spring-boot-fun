package com.gypsyengineer.simple;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
    
    @RequestMapping("/")
    public String index() {
        return "Like most of life's problems, this one can be solved with bending";
    }
    
}

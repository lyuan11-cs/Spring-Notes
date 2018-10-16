package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    @RequestMapping(value = "/{myName}", method = RequestMethod.GET)
    public String greeting(@PathVariable String myName){
        return "Hello  " + myName;

    }
    @RequestMapping(value = "/hello/{userId}", method = RequestMethod.GET)
    public String greeting(@PathVariable int userId){
        return "Hello  " + userId;
    }



}

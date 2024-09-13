package com.Shivam.demoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello People!";
    }

    @GetMapping(path = "/welcome")
    public String welcome(){
        return "Welcome Back";
    }

    @GetMapping(path = "/random")
    public int randomNumber(){
        return (int) (Math.random() * 10);
    }

    @GetMapping(path = "/name")
    public String yourName(){
        return "Your Name Here !";
    }

}

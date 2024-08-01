package com.Shivam.demoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello People!";
    }

    @GetMapping(path = "/random")
    public int randomNumber(){
        return (int) (Math.random() * 10);
    }

}

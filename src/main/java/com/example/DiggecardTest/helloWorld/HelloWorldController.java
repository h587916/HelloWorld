package com.example.DiggecardTest.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Hello World";
    }
}

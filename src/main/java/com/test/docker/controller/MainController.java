package com.test.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testdocker")
public class MainController {

    @GetMapping
    public String getTest() {
        return "Test docker";
    }

}

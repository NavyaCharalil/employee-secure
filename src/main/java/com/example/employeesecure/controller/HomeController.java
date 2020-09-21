package com.example.employeesecure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/employee/home")
    public String home(){ return "Welcomee"; }

}

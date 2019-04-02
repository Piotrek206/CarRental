package com.example.CarRental.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRentalController {
    @RequestMapping("/")
    public String hello(){
        return "Hello World!";
    }
}
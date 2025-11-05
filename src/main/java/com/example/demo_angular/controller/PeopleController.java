package com.example.demo_angular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_angular.service.IPeopleService;

@RestController
@RequestMapping("/api/people")
@CrossOrigin("*")
public class PeopleController {
    @Autowired
    private IPeopleService iPeopleService;
    

}

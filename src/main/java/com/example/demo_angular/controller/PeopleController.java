package com.example.demo_angular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_angular.service.IPeopleService;

@RestController
@RequestMapping("/api/v1/people")
@CrossOrigin("*")
public class PeopleController {
    @Autowired
    private IPeopleService iPeopleService;

    @GetMapping("/list")
    public ResponseEntity<List<People>> list() {
        var result :list<People>= iPeopleService.findall();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    @PostMapping("/save")
    public ResponseEntity<People> save(@RequestBody People people) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iPeopleService.save(people);
        if (result == 1) {
            serviceResponse.setMessage("People saved successfully");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<People> update(@RequestBody People people) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iPeopleService.update(people);
        if (result == 1) {
            serviceResponse.setMessage("People updated successfully");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<People> delete(@PathVariable int id) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iPeopleService.delete(id);
        if (result == 1) {
            serviceResponse.setMessage("People deleted successfully");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }
}

package com.example.demo_angular.service;

import java.util.List;

import com.example.demo_angular.model.People;

public interface IPeopleService {
    public List<People> findAll();
    public int save(People people);
    public int delete(int id);
    public int update(People people);
}

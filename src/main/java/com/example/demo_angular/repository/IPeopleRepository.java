package com.example.demo_angular.repository;

import com.example.demo_angular.model.People;

import java.util.List;

public interface IPeopleRepository {
    public List<People> findall();
    public int save(People people);
    public int delete(int id);
    public int update(People people);
}

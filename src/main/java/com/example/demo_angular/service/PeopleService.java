package com.example.demo_angular.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo_angular.model.People;
import com.example.demo_angular.repository.IPeopleRepository;

@Service
public class PeopleService implements IPeopleService{

    @Autowired
    private IPeopleRepository iPeopleRepository;

    @Override
    public List<People> findAll() {
        List<People> list;
        try {
            list = iPeopleRepository.findAll();
        } catch (Exception e) {
           throw e;
        }
    }

    @Override
    public int save(People people) {
        int row;
        try {
            row=iPeopleRepository.save(people);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int delete(int id) {
        int row;
        try {
            row=iPeopleRepository.delete(id);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int update(People people) {
        int row;
        try {
            row=iPeopleRepository.update(people);
        } catch (Exception e) {
            throw e;
        }
    }

}

package com.example.demo_angular.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo_angular.model.People;
@Repository
public class PeopleRepository implements IPeopleRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<People> findall() {
       String sql = "SELECT * FROM people";
       return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(People.class));
    }

    @Override
    public int save(People people) {
        String sql = "INSERT INTO people VALUES (?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[] {
            people.getId(),
            people.getName(),
            people.getLastName(),
            people.getIdCard()
        });
    }

    @Override
    public int delete(int id) {
       String sql = "DELETE FROM people WHERE id = ?";
         return jdbcTemplate.update(sql, new Object[] {id});
    }

    @Override
    public int update(People people) {
        String sql = "UPDATE people SET name = ?, last_name = ?, id_card = ? WHERE id = ?";
        return jdbcTemplate.update(sql, new Object[] {
            people.getName(),
            people.getLastName(),
            people.getIdCard(),
            people.getId()
        });
    }

}

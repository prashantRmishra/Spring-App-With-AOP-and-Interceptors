package com.example.demo.dao.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.bean.Employee;

import org.springframework.jdbc.core.RowMapper;

public class Mapper implements RowMapper<Employee>{

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
       Employee e = new Employee();
       e.setId(rs.getInt("id"));
       e.setName(rs.getString("name"));
       e.setAge(rs.getInt("age"));
        return e;
    }
    
}

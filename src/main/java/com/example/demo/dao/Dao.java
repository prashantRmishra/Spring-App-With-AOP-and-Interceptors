package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends JpaRepository<Employee,Long> {
   List<Employee> findAll();
   Employee findById(int id);
   Employee save(Employee e);
   int deleteById(int id);
}

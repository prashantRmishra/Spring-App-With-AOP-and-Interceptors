package com.example.demo.controller;
import java.util.List;

import com.example.demo.Exceptions.UserNotFoudException;
import com.example.demo.bean.Employee;
import com.example.demo.dao.AddressDao;
import com.example.demo.dao.Dao;
import com.example.demo.service.EmployeeService;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    Dao dao;
    @Autowired
    EmployeeService service;
 /*    @Autowired
    AddressDao adddao; */

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> e = null;
        // e = dao.getAllEmpDetails();
        service.getAllEmpDetailsMethodCAlled("prashant");

        e = dao.findAll();
        if(e==null) throw new UserNotFoudException("no data present");
        return ResponseEntity.ok(e);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getEmployeDetails(@PathVariable int id){
        Employee e = null;
        // e = dao.getEmpDEtails(id);
        e = dao.findById(id);
        if(e==null) throw new UserNotFoudException("no data present for id :"+id);
        return ResponseEntity.ok(e);
    }
    @PostMapping("/add")
    public boolean addEmployee(@RequestBody Employee e){
        // boolean result = dao.addEmp(e);
        boolean result = dao.save(e).equals(null) ? false:true;
        if(result==false) throw new UserNotFoudException("user with id already exisits");
        return result;
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteEmplyee(@PathVariable int id){
        // boolean result = dao.deleteEmp(id);
        boolean result = dao.deleteById(id) > 0 ?true:false;
        if(result==false) throw new UserNotFoudException("no data present for id :"+id);
        return result;
    }

    /* address Controllers */
 /*    @GetMapping("address/{id}")
    public ResponseEntity<Object> getAddrrss(@PathVariable int id){
        Address result;
        result = adddao.findByAdd(id);
        return new ResponseEntity<Object>(result, HttpStatus.ACCEPTED);
    } */
}

package com.example.demo.bean;

import java.beans.JavaBean;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity(name = "emp")
@JavaBean
public class Employee implements Serializable{
    @Id
    private int id;
    private String name;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "add")
    private Address address;



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;   
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

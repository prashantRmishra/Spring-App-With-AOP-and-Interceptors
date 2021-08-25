package com.example.demo.bean;

import java.beans.JavaBean;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "address")
@JavaBean
public class Address implements Serializable {
    @Id
    private int add;

    private String addressLine1;

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @OneToOne(mappedBy = "address")
    private Employee emp;

    public int getAdd() {
        return this.add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

   
    
}

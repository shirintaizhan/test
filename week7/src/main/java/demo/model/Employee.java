package com.shop.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surName;
    private String address;
    private int salary;
    private Date age;
    private String position;
    
    
    public Employee(int id, String name, String surName, String address,int salary, Date age, String position) {
    this.id = id;
    this.name = name;
    this.surName = surName;
    this.address = address;
    this.salary = salary;
    this.age = age;
    this.position = position;
    }
    public int getId() {
    return id;
    }
    public void setId(int id) {
    this.id = id;
    }
    public String getName() {
    return name;
    }
    
    public void setName(String name) {
    this.name = name;
    }
    
    public String getSurName() {
    return surName;
    }
    
    public void setSurName(String surName) {
    this.surName = surName;
    }
    
    public String getAddress() {
    return address;
    }
    
    public void setAddress(String address) {
    this.address = address;
    }
    
    public double getSalary() {
    return salary;
    }
    
    public void setSalary(int salary) {
    this.salary = salary;
    }
    
    public Date getAge() {
    return age;
    }
    
    public void setAge(Date age) {
    this.age = age;
    }
    
    public String getPosition() {
    return position;
    }
    
    public void setPosition(String position) {
    this.position = position;
}
}

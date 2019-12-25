package com.shop.demo.model;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Entity
@Table
public class Customer {

    @Id
    @Column(name = "contact_id")
    private long customerId;

    @OneToOne(fetch = FetchType.EAGER)
    @GeneratedValue(generator = "user_id")
    @JoinColumn(name = "user_id")
    private long userId;

    @Column(name = "client_name", length = 30)
    private String name;

    @Column(name = "surname", length = 50)
    private String surname;

    @Column(name = "number")
    private String number;

    @Column(name = "address")
    private String address;

    public Customer() { }

    public Customer( long userId, String name, String surname, String number, String address){
        this.userId=userId;
        this.name=name;
        this.surname=surname;
        this.number=number;
        this.address=address;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

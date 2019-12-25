package com.shop.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long employeeId;

    @Column(name = "surname", length = 50)
    private String surname;

    @Column(name = "employee_name", length = 20)
    private String name;

    @Column(name = "employee_birthday")
    private Date birthday;

    @Column(name = "payment")
    private int payment;

    @OneToOne(fetch = FetchType.EAGER)
    @GeneratedValue(generator = "fk_order_id")
    @JoinColumn(name = "order_id")

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "employee_role",joinColumns = @JoinColumn(name = "employee_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> role;

    public Employee(){ }

    public Employee( String surname, String name, Date birthday,int payment, Set<Role> role) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.payment=payment;
        this.role = role;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public Set<Role> getRoles() {
        return role;
    }

    public void setRoles(Set<Role> roles) {
        this.role = roles;
    }

}

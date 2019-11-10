package com.shop.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int name;
    private String surname;
    private Date birthday;

    public Client(){}
    public Client(int id, int name, String surname, Date birthday) {
        this.id = id;
        this.name = name;
        this.surname=surname;
        this.birthday=birthday;
    }
    public int getId() {
        return id;
    }

    public int getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public Date getBirthday()
    {
        return birthday;
    }


}

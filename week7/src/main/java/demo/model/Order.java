package com.shop.demo.model;

public class Order {
    private int id;
    private String name;
    private String surName;
    private String date;
    private boolean pay;

    public Order(){};
    public Order(int id, String name,String surName, String date, boolean pay) {
        this.id = id;
        this.name = name;
        this.surName=surName;
        this.date = date;
        this.pay = pay;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate () {
        return date;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    public boolean isPay () {
        return pay;
    }

}

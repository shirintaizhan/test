package com.shop.demo.model;

import javax.persistence.*;
//
//@Entity
//@Table(name="laptop")
//public class Laptop {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id_laptop;
//     private String name ;
//     private String CPU;
//     private String RAM;
//     private String storageDevice;
//     private String screen;
//     private Double price;
//
//     public Laptop(){}
//
//     public Laptop(  int id, String name, String CPU, String RAM, String storageDevice, String screen, double price)
//     {
//         this.id_laptop=id;
//         this.name=name;
//         this.CPU=CPU;
//         this.RAM=RAM;
//         this.storageDevice=storageDevice;
//         this.screen=screen;
//         this.price=price;
//     }
//
//    public Laptop(String name, String CPU, String RAM, String storageDevice, String screen, Double price) {
//        this.name = name;
//        this.CPU = CPU;
//        this.RAM = RAM;
//        this.storageDevice = storageDevice;
//        this.screen = screen;
//        this.price = price;
//    }
//
//    public void setId_laptop(int id) {
//         this.id_laptop=id;
//     }
//
//     public int getId_laptop() {
//         return id_laptop;
//     }
//
//     public void setName(String name) {
//         this.name =name;
//     }
//
//     public String getName() {
//         return name;
//     }
//
//     public void setCPU(String CPU) {
//         this.CPU=CPU;
//     }
//
//     public String getCPU() {
//         return CPU;
//     }
//
//     public void setRAM( String RAM) {
//         this.RAM = RAM;
//     }
//
//     public String getRAM() { return RAM; }
//
//     public void setStorageDevice (String storageDevice) {
//         this.storageDevice=storageDevice;
//     }
//
//     public String getStorageDevice() {
//         return storageDevice;
//     }
//
//     public void setScreen(String screen) {
//         this.screen=screen;
//     }
//
//     public String getScreen() {
//         return screen;
//     }
//
//     public void setPrice(double price) {
//         this.price=price;
//     }
//
//     public double getPrice() { return price; }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//     public String toString() {
//         return "name: " + name+"\nCPU: " + CPU+"\nRAM: "+ RAM+
//                 "\nStorage device: "+storageDevice+
//                 "\nscreen: " + screen + "\nPrice: "+ price;
//     }
//
//}
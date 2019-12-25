package com.shop.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products" )
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;

    @Column(name = "product_name", length = 100)
    private String productName;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "cpu", length = 20)
    private String CPU;

    @Column(name = "ram", length = 20)
    private String RAM;

    @Column(name = "storage_device")
    private String storageDevice;

    @Column(name = "screen")
    private String screen;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;

    @OneToMany(fetch = FetchType.EAGER)
    @GeneratedValue(generator = "fk_categories_id")
    @JoinColumn(name = "categories_id")
    private long categoriesId;

    @Column(name = "of_creation")
    private Date ofCreation;

    public Product(){ }

    public Product(String productName, String description, String CPU, String RAM, String storageDevice, String screen, double price, int quantity, Date ofCreation) {
        this.productName = productName;
        this.description = description;
        this.CPU = CPU;
        this.RAM = RAM;
        this.storageDevice = storageDevice;
        this.screen = screen;
        this.price = price;
        this.quantity = quantity;
        this.ofCreation = ofCreation;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(String storageDevice) {
        this.storageDevice = storageDevice;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(long categoriesId) {
        this.categoriesId = categoriesId;
    }

    public Date getOfCreation() {
        return ofCreation;
    }

    public void setOfCreation(Date ofCreation) {
        this.ofCreation = ofCreation;
    }
}
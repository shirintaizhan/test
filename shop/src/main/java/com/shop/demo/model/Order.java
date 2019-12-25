package com.shop.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order_user")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long orderId;

    @OneToMany(fetch = FetchType.EAGER)
    @GeneratedValue(generator = "fk_order_id")
    @JoinColumn(name = "order_id")
    private long productId;

    @OneToOne(fetch = FetchType.EAGER)
    @GeneratedValue(generator = "fk_user_id")
    @JoinColumn(name = "user_id")
    private long userId;

    @OneToOne(fetch = FetchType.EAGER)
    @GeneratedValue(generator = "fk_employee_id")
    @JoinColumn(name = "employee_id")
    private long employeeId;

    @Column(name = "total")
    private long total;

    @ElementCollection(targetClass = Product.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "product", joinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products = new ArrayList<Product>();

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "is_paid")
    private boolean isPaid;

    public Order() { }

    public Order(long total, List<Product> products, Date orderDate, boolean isPaid) {
        this.total = total;
        this.products = products;
        this.orderDate = orderDate;
        this.isPaid = isPaid;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
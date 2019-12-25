package com.shop.demo.controller;

import com.shop.demo.model.Order;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Entity
@Table
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basket_id")
    private long basketId;

    @OneToMany(fetch = FetchType.EAGER)
    @GeneratedValue(generator = "fk_basket_id")
    @JoinColumn(name = "basket_id")
    private Order order;

    public Basket(){}

    public Basket(long basketId) {
        this.basketId = basketId;
    }

    public long getBasketId() {
        return basketId;
    }

    public void setBasketId(long basketId) {
        this.basketId = basketId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

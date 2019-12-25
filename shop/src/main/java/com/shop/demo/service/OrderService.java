package com.shop.demo.service;

import com.shop.demo.model.Order;
import com.shop.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public Order create(Order order){
        return orderRepository.save(order);
    }

    public Optional<Order> findById(long id){
        return orderRepository.findById(id);
    }
    public String deleteById(long id){
        orderRepository.deleteById(id);
        return "Order is number:" + id + "has been deleted!";
    }

    public Order changeById(long orderId, Order order) throws Exception{
        return orderRepository.findById(orderId)
                .map(orders -> {
                    orders.setOrderId(order.getOrderId());
                    orders.setProductId(order.getProductId());
                    orders.setUserId(order.getUserId());
                    orders.setEmployeeId(order.getEmployeeId());
                    orders.setTotal(order.getTotal());
                    orders.setProducts(order.getProducts());
                    orders.setOrderDate(order.getOrderDate());
                    orders.setPaid(order.isPaid());
                    return orderRepository.save(orders);
                }).orElseThrow(Exception::new);
        }
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public String deleteAll(){
        orderRepository.deleteAll();
    return "All orders have been deleted!";
    }
//     public List<Order> sortByDate(List<Order> order){
//        orderRepository.findAll(sortByDate());
//     }
}
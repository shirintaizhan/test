package com.shop.demo.controller;

import com.shop.demo.model.Order;
import com.shop.demo.repository.OrderRepository;
import com.shop.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/")
    public Order save(@RequestBody Order order){
       return orderService.create(order);
    }

    @GetMapping("/{orderId}")
    public Optional<Order> view (@PathVariable("orderId") long orderId){
         return orderService.findById(orderId);
    }

    @PutMapping("/{orderId}")
    public Order update(@PathVariable("orderId")  long orderId, @RequestBody Order order) throws Exception {
       return orderService.changeById(orderId,order);
    }

    @GetMapping ("/list")
    public List<Order> list (){
        return orderService.getAll();
    }

    @DeleteMapping("{orderId}")
    public String delete(@PathVariable("orderId") long orderId){
       return orderService.deleteById(orderId);
    }

//    @GetMapping("/all")
//   public String deleteAll(){
//        orderService.deleteAll();
//    }
}
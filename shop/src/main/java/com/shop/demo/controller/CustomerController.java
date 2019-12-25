package com.shop.demo.controller;

import com.shop.demo.model.Customer;
import com.shop.demo.repository.CustomerRepository;
import com.shop.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/")
    public Customer create (Customer customer){
        return customerService.create(customer);
    }

    @GetMapping("/{customerId}")
    public Optional<Customer> viewCustomer(@PathVariable("customerId") long customerId){
        return customerService.findById(customerId);
    }

    @PutMapping("/{customerId}")
    public Customer update(@PathVariable("customerId") long customerId, @RequestBody Customer customer) throws Exception {
            return customerService.changeById(customerId,customer);
    }

    @GetMapping("/list")
    public List<Customer> List () {
        return customerService.getAll();
    }

    @DeleteMapping("/{customerId}")
    public String delete(@PathVariable("customerId") long customerId){
       return customerService.deleteById(customerId);
    }
}
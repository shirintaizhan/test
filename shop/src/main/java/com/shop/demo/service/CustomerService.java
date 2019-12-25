package com.shop.demo.service;

import com.shop.demo.model.Customer;
import com.shop.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

   private CustomerRepository customerRepository;

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public Optional<Customer> findById(long id) {
        return customerRepository.findById(id);
    }

    public String deleteById(long id) {
        customerRepository.deleteById(id);
        return "Customer is number:" + id + " has been deleted!";
    }

    public Customer changeById(long customerId, Customer customer) throws Exception{
        return customerRepository.findById(customerId)
                .map(newCustomer -> {
                    newCustomer.setCustomerId(customer.getCustomerId());
                    newCustomer.setUserId(customer.getUserId());
                    newCustomer.setName(customer.getName());
                    newCustomer.setSurname(customer.getSurname());
                    newCustomer.setNumber(customer.getNumber());
                    newCustomer.setAddress(customer.getAddress());
                    return customerRepository.save(newCustomer);
                }).orElseThrow(Exception::new);
    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
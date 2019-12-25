package com.shop.demo.controller;

import com.shop.demo.model.Employee;
import com.shop.demo.repository.EmployeeRepository;
import com.shop.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public Employee save(@RequestBody Employee employee) {
       return employeeService.create(employee);
    }

    @GetMapping("/{employeeId}")
    public Optional<Employee> view(@PathVariable("employeeId") long employeeId) {
      return employeeService.findById(employeeId);
    }

    @PutMapping("/{employeeId}")
    public Employee update(@PathVariable("employeeId") long employeeId, Employee employee) throws Exception {
       return employeeService.changeById(employeeId,employee);
    }

    @GetMapping("/list")
    public List<Employee> list() {
        return employeeService.getAll();
    }

    @DeleteMapping("/{employeeId}")
    public String deleteUser(@PathVariable("employeeId") Long employeeId) {
       return employeeService.deleteById(employeeId);
    }
}
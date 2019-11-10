package com.shop.demo.controller;

import com.shop.demo.model.Employee;
import com.shop.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class EmployeeController {

    @Autowired
   EmployeeRepository EmployeeRepository;

    @PostMapping ("/employee/save")
    public String save(@RequestBody Employee employee){

        EmployeeRepository.save(employee);

        return "saved";

    }

    @GetMapping("/employee/{employeeId}/view")
    public String view (@PathVariable("employeeId") int employeeId){

        Optional<Employee> employee = EmployeeRepository.findById(employeeId);

        return  employee.toString();

    }

    @PostMapping ("/employee/update")
    public String update(@RequestBody Employee employee){

        EmployeeRepository.save(employee);

        return "updated";

    }

    @GetMapping ("/employee/list")
    public String list (){

        List<Employee> list =EmployeeRepository.findAll();

        return list.toString();

    }

    @DeleteMapping ("/employee/{employeeId}/delete")
    public String delete (@PathVariable int employeeId) {

        EmployeeRepository.deleteById(employeeId);

        return "deleted";

    }
}

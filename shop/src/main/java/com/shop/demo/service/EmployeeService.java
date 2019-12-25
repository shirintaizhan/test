package com.shop.demo.service;

import com.shop.demo.model.Employee;
import com.shop.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public Employee create(Employee employee){
        return employeeRepository.save(employee);
    }

    public Optional<Employee> findById(long employeeId){
        return employeeRepository.findById(employeeId);
    }

    public String deleteById(long id){
        employeeRepository.deleteById(id);
        return "Employee is number:" + id + "has been deleted!";
    }

    public Employee changeById(long employeeId, Employee employee) throws Exception{
        return employeeRepository.findById(employeeId)
                .map(newEmployee -> {
                  newEmployee.setEmployeeId(employee.getEmployeeId());
                  newEmployee.setName(employee.getName());
                  newEmployee.setSurname(employee.getSurname());
                  newEmployee.setBirthday(employee.getBirthday());
                  newEmployee.setPayment(employee.getPayment());
                  newEmployee.setRoles(employee.getRoles());
                  return employeeRepository.save(newEmployee);
                }).orElseThrow(Exception::new);
    }

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
}

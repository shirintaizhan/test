package com.shop.demo.repository;

import com.shop.demo.model.Employee;
import com.shop.demo.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}

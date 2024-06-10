package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Employee;


public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}

package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees=new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}

	public void createEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
	}
}

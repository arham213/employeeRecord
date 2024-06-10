package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/createEmployee")
	public void createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateEmployee")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		employeeService.deleteEmployee(id);
	}
}

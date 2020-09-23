package com.example.Sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sample.bean.Employee;
import com.example.Sample.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public List<Employee> getAllEmployees(){
		return (List<Employee>) repo.findAll();
	}
	
	public Employee getEmployeeById(long empid) {
		return repo.findById(empid).get();
	}
	
	public void addEmployee(Employee employee) {
		repo.save(employee);
	}
	
	public void deleteEmployee(long empid) {
		repo.deleteById(empid);
	}
	

}

package com.example.Sample.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.Sample.bean.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

	

}

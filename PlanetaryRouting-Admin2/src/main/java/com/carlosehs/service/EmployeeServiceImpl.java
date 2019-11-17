package com.carlosehs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosehs.entity.Employee;
import com.carlosehs.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	@Override
	public Iterable<Employee> getAllEmployees() {
		return repository.findAll();
	}

}

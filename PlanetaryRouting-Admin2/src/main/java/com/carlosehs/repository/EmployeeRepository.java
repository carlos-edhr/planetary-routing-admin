package com.carlosehs.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carlosehs.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	public Employee findByName(String name);

}

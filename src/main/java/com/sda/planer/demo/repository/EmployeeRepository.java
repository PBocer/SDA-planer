package com.sda.planer.demo.repository;

import com.sda.planer.demo.model.Employee;
import org.h2.engine.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

package com.sda.planer.demo.sercive;

import com.sda.planer.demo.model.Employee;
import com.sda.planer.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class EmployeeService {


    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Object getAll() {
        return (List<Employee>)employeeRepository.findAll();
    }



    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee get(Long id) {
        return employeeRepository.findOne(id);
    }
}
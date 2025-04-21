package org.example.employee_payroll.service;


import org.example.employee_payroll.model.Employee;
import org.example.employee_payroll.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getData() {
        return employeeRepository.findAll();
    }
}

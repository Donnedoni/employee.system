package com.employee.employee.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.system.models.Employee;
import com.employee.employee.system.repo.EmployeeRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/employees")
public class EmployeeController {
    @Autowired 
    private EmployeeRepo employeeRepo;
    
    @GetMapping
    public List<Employee>getEmployees(){
        return employeeRepo.findAll();
    }

    @GetMapping
    public Optional<Employee>findOne(int empId){
        return employeeRepo.findById(Employee.getEmpId());
    }

    @PostMapping
    public Employee save(@Validated @NonNull @RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

    @PutMapping("{empId}") 
    public Employee update(@Validated @NonNull @RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

}
    


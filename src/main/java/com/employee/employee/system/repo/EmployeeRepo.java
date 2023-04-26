package com.employee.employee.system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee.system.models.Employee;



public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}

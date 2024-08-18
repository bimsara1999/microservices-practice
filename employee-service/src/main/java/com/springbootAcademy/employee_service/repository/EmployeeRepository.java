package com.springbootAcademy.employee_service.repository;

import com.springbootAcademy.employee_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

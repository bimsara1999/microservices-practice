package com.springbootAcademy.employee_service.service;

import com.springbootAcademy.employee_service.dto.ApiResponseDTO;
import com.springbootAcademy.employee_service.dto.EmployeeDTO;

public interface EmployeeService {

    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

    ApiResponseDTO getEmployeeById(Long id);
}

package com.springbootAcademy.department_service.service;

import com.springbootAcademy.department_service.dto.DepartmentDTO;

public interface DepartmentService {

    DepartmentDTO saveDepartment(DepartmentDTO departmentDTO);

    DepartmentDTO getDepartmentByCode(String departmentCode);
}

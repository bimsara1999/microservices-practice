package com.springbootAcademy.employee_service.service;


import com.springbootAcademy.employee_service.dto.DepartmentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url="http://localhost8080" , value="DEPARTMENT-SERVICE")
//@FeignClient(name = " DEPARTMENT-SERVICE")
public interface APIClient {

    @GetMapping("api/departments/{department-code}")
    DepartmentDTO getDepartment(@PathVariable("department-code") String departmentCode);

}

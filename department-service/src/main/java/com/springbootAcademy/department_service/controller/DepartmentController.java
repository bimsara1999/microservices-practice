/*package com.springbootAcademy.department_service.controller;

import com.springbootAcademy.department_service.dto.DepartmentDTO;
import com.springbootAcademy.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {

    @Autowired
    public DepartmentService departmentService;


    @PostMapping
    public ResponseEntity<DepartmentDTO> saveDepartment(@RequestBody DepartmentDTO departmentDTO){
        DepartmentDTO departmentDTO1 = departmentService.saveDepartment(departmentDTO);
        return new ResponseEntity<>(departmentDTO1 , HttpStatus.CREATED);

    }

    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDTO> getDepartment(@PathVariable(value = "department-code")String departmentCode){
        DepartmentDTO departmentDTO = departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(departmentDTO , HttpStatus.OK);
    }
}*/

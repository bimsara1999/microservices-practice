package com.springbootAcademy.department_service.service.impl;

import com.springbootAcademy.department_service.dto.DepartmentDTO;
import com.springbootAcademy.department_service.entity.Department;
import com.springbootAcademy.department_service.repository.DepartmentRepository;
import com.springbootAcademy.department_service.service.DepartmentService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class DepartmentServiceIMPL  implements DepartmentService {


    private final DepartmentRepository departmentRepository;

    @Override
    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {

        Department department = new Department(

                departmentDTO.getId(),
                departmentDTO.getDepartmentName(),
                departmentDTO.getDepartmentDescription(),
                departmentDTO.getDepartmentCode()
        );
        //entity eken genna ganna

        Department savedDepartment = departmentRepository.save(department);
        DepartmentDTO savedDepartmentDTO = new DepartmentDTO(

                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDescription(),
                savedDepartment.getDepartmentCode()


        );
        return savedDepartmentDTO;
    }

    @Override
    public DepartmentDTO getDepartmentByCode(String Code) {
        Department department = departmentRepository.findAllByDepartmentCode(Code);

        DepartmentDTO departmentDTO = new DepartmentDTO(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );
        return departmentDTO;

    }
}

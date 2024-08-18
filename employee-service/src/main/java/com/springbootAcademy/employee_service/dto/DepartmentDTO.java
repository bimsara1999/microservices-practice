package com.springbootAcademy.employee_service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DepartmentDTO {


    private Long id;

    private String departmentName;

    private String departmentDescription;

    private String departmentCode;
}

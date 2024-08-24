package com.springbootAcademy.employee_service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDTO {

    private Long id;

    private String organizationName;
    private String organizationDescription;

    private String organizationCode;

    private LocalDateTime createDate;
}

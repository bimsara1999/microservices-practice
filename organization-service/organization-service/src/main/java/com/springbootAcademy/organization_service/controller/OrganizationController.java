package com.springbootAcademy.organization_service.controller;


import com.springbootAcademy.organization_service.dto.OrganizationDTO;
import com.springbootAcademy.organization_service.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/organization")
@AllArgsConstructor
public class OrganizationController {

    private final OrganizationService organizationService;


    @PostMapping
    public ResponseEntity<OrganizationDTO> saveOrganization(@RequestBody OrganizationDTO organizationDTO) {
     OrganizationDTO savedOrganizationDTO = organizationService.saveOrganization(organizationDTO);
     return new ResponseEntity<>(savedOrganizationDTO, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<OrganizationDTO>getOrganization(@PathVariable ("code") String organizationCode) {
        OrganizationDTO savedOrganizationDTO = organizationService.getOrganizationByCode(organizationCode);
        return ResponseEntity.ok(savedOrganizationDTO);
    }
}

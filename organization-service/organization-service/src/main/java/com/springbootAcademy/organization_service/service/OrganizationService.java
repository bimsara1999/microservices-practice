package com.springbootAcademy.organization_service.service;

import com.springbootAcademy.organization_service.dto.OrganizationDTO;

public interface OrganizationService {

    OrganizationDTO saveOrganization(OrganizationDTO organizationDTO);
    OrganizationDTO getOrganizationByCode(String organizationCode);
}

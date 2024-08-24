package com.springbootAcademy.organization_service.mapper;

import com.springbootAcademy.organization_service.dto.OrganizationDTO;
import com.springbootAcademy.organization_service.entity.Organization;

public class OrganizationMapper {

    public static OrganizationDTO mapToOrganizationDTO(Organization organization) {
        OrganizationDTO organizationDTO = new OrganizationDTO(

                organization.getId(),
                organization.getOrganizationName(),
                organization.getOrganizationDescription(),
                organization.getOrganizationCode(),
                organization.getCreateDate()
        );

        return organizationDTO;
    }

    public static Organization mapToOrganization(OrganizationDTO organizationDTO) {
        Organization organization = new Organization(
                organizationDTO.getId(),
                organizationDTO.getOrganizationName(),
                organizationDTO.getOrganizationDescription(),
                organizationDTO.getOrganizationCode(),
                organizationDTO.getCreateDate()
        );
        return organization;
    }
}

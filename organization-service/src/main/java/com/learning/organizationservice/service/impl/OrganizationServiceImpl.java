package com.learning.organizationservice.service.impl;

import com.learning.organizationservice.dto.OrganizationDto;
import com.learning.organizationservice.entity.Organization;
import com.learning.organizationservice.mapper.OrganizationMapper;
import com.learning.organizationservice.repository.OrganizationRepository;
import com.learning.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;
    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        //convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization = organizationRepository.save(organization);
        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization=organizationRepository.findByorganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}

package com.learning.organizationservice.repository;

import com.learning.organizationservice.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByorganizationCode(String organizationCode);
}

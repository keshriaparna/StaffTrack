package com.learning.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        description = "EmployeeDto Model Information"
)
public class EmployeeDto {
    @Schema(
            description = "Employee Id"
    )
    private Long id;
    @Schema(
            description = "FirstName"
    )
    private String firstName;
    @Schema(
            description = "LastName"
    )
    private String lastName;
    @Schema(
            description = "Email"
    )
    private String email;
    @Schema(
            description = "Employee's Department Code"
    )
    private String departmentCode;
    @Schema(
            description = "Employee's  Organization Code"
    )
    private String organizationCode;
}

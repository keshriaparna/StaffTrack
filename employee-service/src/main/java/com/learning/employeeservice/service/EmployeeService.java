package com.learning.employeeservice.service;

import com.learning.employeeservice.dto.APIResponseDto;
import com.learning.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employee);

    APIResponseDto getEmployeeById(Long employeeId);
}

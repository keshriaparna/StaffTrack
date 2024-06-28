package com.learning.departmentservice.service.impl;

import com.learning.departmentservice.dto.DepartmentDto;
import com.learning.departmentservice.entity.Department;
import com.learning.departmentservice.mapper.DepartmentMapper;
import com.learning.departmentservice.repository.DepartmentRepository;
import com.learning.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        //convert department dto to department jpa entity
        Department department= DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);

        //convert department jpa entity to department dto
        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);

        return departmentDto;
    }
}

package com.springbootAcademy.department_service.repository;

import com.springbootAcademy.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findAllByDepartmentCode(String code);
}

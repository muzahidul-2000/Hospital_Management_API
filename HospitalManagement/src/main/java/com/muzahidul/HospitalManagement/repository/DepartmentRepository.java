package com.muzahidul.HospitalManagement.repository;

import com.muzahidul.HospitalManagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
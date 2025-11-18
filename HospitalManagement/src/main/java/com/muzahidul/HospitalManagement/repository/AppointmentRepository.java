package com.muzahidul.HospitalManagement.repository;

import com.muzahidul.HospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
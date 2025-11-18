package com.muzahidul.HospitalManagement.repository;

import com.muzahidul.HospitalManagement.entity.User;
import com.muzahidul.HospitalManagement.entity.type.AuthProviderType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.ScopedValue;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);

    Optional<User> findByProviderIdAndProviderType(String providerId, AuthProviderType providerType);
}

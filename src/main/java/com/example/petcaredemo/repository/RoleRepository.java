package com.example.petcaredemo.repository;

import com.example.petcaredemo.entity.ERole;
import com.example.petcaredemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

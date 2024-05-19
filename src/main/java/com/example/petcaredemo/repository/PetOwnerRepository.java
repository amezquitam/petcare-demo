package com.example.petcaredemo.repository;

import com.example.petcaredemo.entity.PetOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetOwnerRepository extends JpaRepository<PetOwner, Long> {

}

package com.example.petcaredemo.repository;


import com.example.petcaredemo.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
    Pet findPetByPetOwnerId(Long id);

}

package com.example.petcaredemo.repository;


import com.example.petcaredemo.entity.Pet;
import com.example.petcaredemo.entity.PetOwner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findPetsByOwner(PetOwner owner);

}

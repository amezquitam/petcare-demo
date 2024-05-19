package com.example.petcaredemo.dto.pet;

import com.example.petcaredemo.dto.petowner.PetOwnerDTO;

public record PetDTO(Long id, String name, String sex, Integer age, PetOwnerDTO petOwner) {
}

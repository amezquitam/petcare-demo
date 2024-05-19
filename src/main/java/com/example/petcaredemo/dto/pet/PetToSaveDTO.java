package com.example.petcaredemo.dto.pet;

import com.example.petcaredemo.dto.petowner.PetOwnerDTO;

public record PetToSaveDTO(String name, String sex, Integer age, PetOwnerDTO petOwner) {
}

package com.example.petcaredemo.dto.pet;

import com.example.petcaredemo.entity.Pet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PetMapper {
    PetDTO petToPetDTO(Pet pet);
    Pet petDTOToPet(PetDTO petDTO);
    Pet petSaveDTOToPet(PetToSaveDTO petToSaveDTO);

}

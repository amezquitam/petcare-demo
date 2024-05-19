package com.example.petcaredemo.dto.petowner;

import com.example.petcaredemo.entity.PetOwner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface PetOwnerMapper {
    PetOwnerDTO petOwnerToPetOwnerDTO(PetOwner petOwner);
    PetOwner petOwnerDTOToPetOwner(PetOwnerDTO petOwnerDTO);
    PetOwner petOwnerSaveDTOToPetOwner(PetOwnerToSaveDTO petOwnerToSaveDTO);
}

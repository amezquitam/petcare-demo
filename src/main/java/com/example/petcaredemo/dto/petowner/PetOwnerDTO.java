package com.example.petcaredemo.dto.petowner;

import com.example.petcaredemo.dto.pet.PetDTO;
import com.example.petcaredemo.dto.user.UserInfoDto;

import java.util.List;

public record PetOwnerDTO(Long id, UserInfoDto user, List<PetDTO> pets) {
}

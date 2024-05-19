package com.example.petcaredemo.dto.appointment;

import com.example.petcaredemo.dto.petowner.PetOwnerDTO;
import com.example.petcaredemo.dto.user.UserInfoDto;
import com.example.petcaredemo.dto.veterinaryoffice.VeterinaryOfficeDTO;

public record AppointmentDTO(Long id, PetOwnerDTO petOwner, VeterinaryOfficeDTO veterinaryOffice, String status) {
}

package com.example.petcaredemo.dto.appointment;

import com.example.petcaredemo.dto.petowner.PetOwnerDTO;
import com.example.petcaredemo.dto.veterinaryoffice.VeterinaryOfficeDTO;

public record AppointmentToSaveDTO(PetOwnerDTO petOwner, VeterinaryOfficeDTO veterinaryOffice, String status) {
}

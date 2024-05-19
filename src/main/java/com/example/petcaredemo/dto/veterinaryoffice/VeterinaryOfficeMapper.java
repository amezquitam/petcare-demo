package com.example.petcaredemo.dto.veterinaryoffice;


import com.example.petcaredemo.entity.VeterinaryOffice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VeterinaryOfficeMapper {
    VeterinaryOfficeDTO veterinaryOfficeToVeterinaryOfficeDTO(VeterinaryOffice veterinaryOffice);
    VeterinaryOffice veterinaryOfficeDTOToVeterinaryOffice(VeterinaryOfficeDTO veterinaryOfficeDTO);
    VeterinaryOffice veterinaryOfficeSaveDTOToVeterinaryOffice(VeterinaryOfficeToSaveDTO veterinaryOfficeToSaveDTO);
}

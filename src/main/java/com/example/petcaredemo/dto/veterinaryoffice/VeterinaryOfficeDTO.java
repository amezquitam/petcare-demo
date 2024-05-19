package com.example.petcaredemo.dto.veterinaryoffice;

import com.example.petcaredemo.dto.user.UserInfoDto;

public record VeterinaryOfficeDTO(Long id, UserInfoDto user, String adress) {
}

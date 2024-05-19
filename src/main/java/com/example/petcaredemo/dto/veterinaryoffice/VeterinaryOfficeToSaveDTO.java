package com.example.petcaredemo.dto.veterinaryoffice;

import com.example.petcaredemo.dto.user.UserInfoDto;

public record VeterinaryOfficeToSaveDTO(UserInfoDto user, String adress) {
}

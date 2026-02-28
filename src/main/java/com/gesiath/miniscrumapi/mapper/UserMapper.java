package com.gesiath.miniscrumapi.mapper;

import com.gesiath.miniscrumapi.dto.CreateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UserResponseDTO;
import com.gesiath.miniscrumapi.entity.User;

public class UserMapper {

    public static UserResponseDTO toResponse(User user){

        return UserResponseDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();

    }

    public static User toEntity(CreateUserRequestDTO dto){

        return User.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();

    }

}

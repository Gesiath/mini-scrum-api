package com.gesiath.miniscrumapi.service;

import com.gesiath.miniscrumapi.dto.CreateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UpdateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UserResponseDTO;

import java.util.List;

public interface IUserService {

    List<UserResponseDTO> getAll();
    UserResponseDTO getById(String id);
    UserResponseDTO create(CreateUserRequestDTO dto);
    UserResponseDTO update(String id, UpdateUserRequestDTO dto);
    void delete(String id);
}

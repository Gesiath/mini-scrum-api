package com.gesiath.miniscrumapi.service;

import com.gesiath.miniscrumapi.dto.CreateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UpdateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UserResponseDTO;

import java.util.List;

public interface IUserService {

    UserResponseDTO create(CreateUserRequestDTO dto);
    UserResponseDTO update(String id, UpdateUserRequestDTO dto);
    void delete(String id);
    List<UserResponseDTO> getAll();

}

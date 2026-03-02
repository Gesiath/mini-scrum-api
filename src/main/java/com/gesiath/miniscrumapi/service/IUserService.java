package com.gesiath.miniscrumapi.service;

import com.gesiath.miniscrumapi.dto.CreateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UpdateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UserResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IUserService {

    Page<UserResponseDTO> getAll(Pageable pageable);
    UserResponseDTO getById(String id);
    UserResponseDTO create(CreateUserRequestDTO dto);
    UserResponseDTO update(String id, UpdateUserRequestDTO dto);
    void delete(String id);
}

package com.gesiath.miniscrumapi.service;

import com.gesiath.miniscrumapi.dto.CreateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UpdateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UserResponseDTO;
import com.gesiath.miniscrumapi.entity.User;
import com.gesiath.miniscrumapi.exception.CustomDataNotFoundException;
import com.gesiath.miniscrumapi.mapper.UserMapper;
import com.gesiath.miniscrumapi.respository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){

        this.userRepository = userRepository;

    }

    @Override
    public Page<UserResponseDTO> getAll(Pageable pageable) {
        return userRepository.findAll(pageable)
                .map(UserMapper::toResponse);
    }

    @Override
    public UserResponseDTO getById(String id){

        User user = userRepository.findById(id)
                .orElseThrow(() -> new CustomDataNotFoundException("User not found"));

        return UserMapper.toResponse(user);
    }

    @Override
    public UserResponseDTO create(CreateUserRequestDTO dto) {

        User user = UserMapper.toEntity(dto);

        return UserMapper.toResponse(userRepository.save(user));

    }

    @Override
    public UserResponseDTO update(String id, UpdateUserRequestDTO dto) {

        User user = userRepository.findById(id).orElseThrow(() -> new CustomDataNotFoundException("User not found"));

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        return UserMapper.toResponse(userRepository.save(user));

    }

    @Override
    public void delete(String id) {

        if (!userRepository.existsById(id)){

            throw new CustomDataNotFoundException("User not found");

        }

        userRepository.deleteById(id);

    }
}

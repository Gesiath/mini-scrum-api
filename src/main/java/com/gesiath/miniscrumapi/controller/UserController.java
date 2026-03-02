package com.gesiath.miniscrumapi.controller;

import com.gesiath.miniscrumapi.dto.CreateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UpdateUserRequestDTO;
import com.gesiath.miniscrumapi.dto.UserResponseDTO;
import com.gesiath.miniscrumapi.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
public class UserController {

    private final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @GetMapping
    public ResponseEntity<Page<UserResponseDTO>> getAll(Pageable pageable){

        return ResponseEntity.ok(iUserService.getAll(pageable));

    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getById(@PathVariable String id){

        return ResponseEntity.ok(iUserService.getById(id));

    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> create(@Valid @RequestBody CreateUserRequestDTO dto){

        return ResponseEntity.status(201).body(iUserService.create(dto));

    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> update(@Valid @PathVariable String id,
                                                  @RequestBody UpdateUserRequestDTO dto){

        return ResponseEntity.ok(iUserService.update(id, dto));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){

        iUserService.delete(id);
        return ResponseEntity.noContent().build();

    }
}

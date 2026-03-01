package com.gesiath.miniscrumapi.controller;

import com.gesiath.miniscrumapi.dto.CreateTaskRequestDTO;
import com.gesiath.miniscrumapi.dto.TaskResponseDTO;
import com.gesiath.miniscrumapi.dto.UpdateTaskRequestDTO;
import com.gesiath.miniscrumapi.service.ITaskService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final ITaskService iTaskService;

    public TaskController(ITaskService iTaskService) {
        this.iTaskService = iTaskService;
    }

    @GetMapping
    public ResponseEntity<List<TaskResponseDTO>> getAll(){

        return ResponseEntity.ok(iTaskService.getAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponseDTO> getById(@PathVariable String id){

        return ResponseEntity.ok(iTaskService.getById(id));

    }

    @PostMapping
    public ResponseEntity<TaskResponseDTO> create(@Valid @RequestBody CreateTaskRequestDTO dto){

        return ResponseEntity.status(201).body(iTaskService.create(dto));

    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskResponseDTO> update(@Valid @PathVariable String id,
                                                  @RequestBody UpdateTaskRequestDTO dto){

        return ResponseEntity.ok(iTaskService.update(id, dto));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){

        iTaskService.delete(id);
        return ResponseEntity.noContent().build();

    }
}

package com.gesiath.miniscrumapi.service;

import com.gesiath.miniscrumapi.dto.CreateTaskRequestDTO;
import com.gesiath.miniscrumapi.dto.TaskResponseDTO;
import com.gesiath.miniscrumapi.dto.UpdateTaskRequestDTO;
import com.gesiath.miniscrumapi.enumerator.Status;

import java.util.List;

public interface ITaskService {

    List<TaskResponseDTO> getAll();
    TaskResponseDTO getById(String id);
    List<TaskResponseDTO> getByStatus(Status status);
    TaskResponseDTO create(CreateTaskRequestDTO dto);
    TaskResponseDTO update(String id, UpdateTaskRequestDTO dto);
    void delete(String id);
}

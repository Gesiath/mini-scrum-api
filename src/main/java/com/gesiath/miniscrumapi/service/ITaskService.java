package com.gesiath.miniscrumapi.service;

import com.gesiath.miniscrumapi.dto.CreateTaskRequestDTO;
import com.gesiath.miniscrumapi.dto.TaskResponseDTO;
import com.gesiath.miniscrumapi.dto.UpdateTaskRequestDTO;

import java.util.List;

public interface ITaskService {

    TaskResponseDTO create(CreateTaskRequestDTO dto);
    TaskResponseDTO update(String id, UpdateTaskRequestDTO dto);
    void delete(String id);
    List<TaskResponseDTO> getAll();

}

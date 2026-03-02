package com.gesiath.miniscrumapi.respository;

import com.gesiath.miniscrumapi.entity.Task;
import com.gesiath.miniscrumapi.enumerator.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {

    List<Task> findByStatus(Status status);

}

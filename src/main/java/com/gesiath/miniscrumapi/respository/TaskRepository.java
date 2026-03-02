package com.gesiath.miniscrumapi.respository;

import com.gesiath.miniscrumapi.entity.Task;
import com.gesiath.miniscrumapi.enumerator.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {

    List<Task> findByStatus(Status status);
    List<Task> findByUser_Id(String user_Id);
    List<Task> findByUser_IdAndStatus(String userId, Status status);

}

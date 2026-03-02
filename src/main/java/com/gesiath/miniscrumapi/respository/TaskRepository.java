package com.gesiath.miniscrumapi.respository;

import com.gesiath.miniscrumapi.entity.Task;
import com.gesiath.miniscrumapi.enumerator.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {

    Page<Task> findByStatus(Status status, Pageable pageable);
    Page<Task> findByUser_Id(String user_Id, Pageable pageable);
    Page<Task> findByUser_IdAndStatus(String userId, Status status, Pageable pageable);

}

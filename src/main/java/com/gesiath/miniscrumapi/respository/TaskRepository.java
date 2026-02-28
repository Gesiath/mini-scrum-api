package com.gesiath.miniscrumapi.respository;

import com.gesiath.miniscrumapi.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {

}

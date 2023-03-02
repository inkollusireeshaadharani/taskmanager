package com.dharani.taskmanager.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dharani.taskmanager.entities.*;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {

    Task findByTaskId(String taskId);

    List<Task> findByTaskHolderName(String taskHolderName);
    
}


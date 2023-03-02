package com.dharani.taskmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dharani.taskmanager.entities.*;
import com.dharani.taskmanager.repositories.*;


@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public Task changeStatus(String taskId) {
        Task task = taskRepository.findByTaskId(taskId);
        task.setTaskStatus("Completed");
        return taskRepository.save(task);
    }

    public void deleteTask(String taskId) {
        taskRepository.deleteById(taskId);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getTaskByHolderName(String taskHolderName) {
        return taskRepository.findByTaskHolderName(taskHolderName);
    }
    
    public Task getTask(String taskId) {
        return taskRepository.findByTaskId(taskId);
    }
}


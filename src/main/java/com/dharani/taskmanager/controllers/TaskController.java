package com.dharani.taskmanager.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.taskmanager.entities.*;
import com.dharani.taskmanager.services.*;


@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/saveTask")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @GetMapping("/changeStatus")
    public Task changeStatus(@RequestParam("id") String taskId) {
        return taskService.changeStatus(taskId);
    }

    @GetMapping("/deleteTask")
    public void deleteTask(@RequestParam("id") String taskId) {
        taskService.deleteTask(taskId);
    }

    @GetMapping("/alltasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    
    @GetMapping("/getTaskByHolderName")
    public List<Task> getTaskByHolderName(@RequestParam("name") String holderName) {
        return taskService.getTaskByHolderName(holderName);
    }
    
    @GetMapping("/getTask")
    public Task getTask(@RequestParam("id") String taskId) {
        return taskService.getTask(taskId);
    }
}


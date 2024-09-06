package com.mlh.controller;


import com.mlh.pojo.Task;
import com.mlh.service.impl.TaskServiceImpl;
import com.mlh.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

/**
 * @author 缪林辉
 * @date 2024/9/5 16:56
 * @DESCRIPTION
 */
@RestController
@RequestMapping("/task")
public class CreateTask {
    @Autowired
    private TaskServiceImpl taskService;

    // @PostMapping
    // public String saveTask(@RequestBody Task task) {
    //     taskService.saveTask(task);
    //     return "Task saved successfully!";
    // }

    @GetMapping(value = "/create")
    public Result CreateTask() {
        Task task = new Task();
        task.setTaskId(UUID.randomUUID().toString());
        taskService.save(task);
        return Result.success();
    }
}

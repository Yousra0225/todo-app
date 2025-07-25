package yousra.todo_app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yousra.todo_app.demo.dto.TaskDTO;
import yousra.todo_app.demo.model.Task;
import yousra.todo_app.demo.service.TaskService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/task")
public class TaskController {

    private final TaskService taskService;

    /**
     * Constructor of the class
     */
    @Autowired
    public TaskController(TaskService taskService){this.taskService=taskService;}

    @GetMapping("/api/task/{id}")
    public Task getTask(@RequestParam UUID taskId){
        return this.taskService.getTask(taskId);
    }

    @PostMapping
    public ResponseEntity<String> createTask(@RequestBody TaskDTO taskDTO){
        taskService.addTask(taskDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Task created");
    }
}

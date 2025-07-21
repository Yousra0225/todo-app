package yousra.todo_app.demo.controller;

import org.springframework.web.bind.annotation.*;
import yousra.todo_app.demo.model.Task;
import yousra.todo_app.demo.repository.TaskRepository;
import yousra.todo_app.demo.service.TaskService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/task")
@CrossOrigin(origins = "*")
public class TaskController {

    private final TaskService taskService;

    /**
     * Constructor of the class
     */
    public TaskController(TaskService taskService){this.taskService=taskService;}

}

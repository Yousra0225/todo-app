package yousra.todo_app.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yousra.todo_app.demo.dto.TaskDTO;
import yousra.todo_app.demo.mapper.TaskMapper;
import yousra.todo_app.demo.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepositry;
    private final TaskMapper taskMapper;

    @Autowired
    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper){
        this.taskMapper = taskMapper;
        this.taskRepositry = taskRepositry;
    }
}

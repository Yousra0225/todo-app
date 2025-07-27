package yousra.todo_app.demo.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yousra.todo_app.demo.dto.TaskDTO;
import yousra.todo_app.demo.mapper.TaskMapper;
import yousra.todo_app.demo.model.Task;
import yousra.todo_app.demo.repository.TaskRepository;
import java.util.UUID;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    @Autowired
    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper){
        this.taskMapper = taskMapper;
        this.taskRepository = taskRepository;
    }

    /**
     * Method to get a task by its id
     * @param taskId
     * @return
     */
    public Task getTask(UUID taskId) {
        return taskRepository.findById(taskId).orElseThrow(() -> new EntityNotFoundException("error: task not found"));
    }

    /**
     *
     * @param taskDTO
     */
    public void addTask(TaskDTO taskDTO){
        taskRepository.save(taskMapper.toTask(taskDTO));
    }

    //yousra.todo_app.demo.model.Task task = new Task;

    /**
     * Method to delete a task by its id
     * @param id
     */
    public void deleteTask(UUID id){
        Task task = taskRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("error: task not found"));
        taskRepository.delete(task);
    }

    public void updateTask(UUID id, TaskDTO taskDTO){
        Task task = taskRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("error: task not found"));
        task.setTitle(taskDTO.getName());
        task.setStatus(taskDTO.getStatus());
        taskRepository.save(task);
    }
}

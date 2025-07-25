package yousra.todo_app.demo.mapper;

import org.springframework.stereotype.Component;
import yousra.todo_app.demo.dto.TaskDTO;
import yousra.todo_app.demo.model.Task;

import java.util.Optional;

@Component
public class TaskMapper {

    /**
     * Method to transfer task to dto task format
     * @param task model
     * @return taskDTO task in dto format
     */
    public TaskDTO toTaskDTO(Task task){
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(task.getId());
        taskDTO.setName(task.getTitle());
        taskDTO.setStatus(task.getStatus());
        return taskDTO;
    }

    public Task toTask(TaskDTO taskDTO){
        return new Task(taskDTO.getId(),taskDTO.getName(), taskDTO.getStatus());
    }


}

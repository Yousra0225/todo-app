package yousra.todo_app.demo.mapper;

import yousra.todo_app.demo.dto.TaskDTO;
import yousra.todo_app.demo.model.Task;

public class TaskMapper {
    TaskDTO taskDTO = new TaskDTO();

    /**
     * Method to transfer task to dto task format
     * @param task model
     * @return taskDTO task in dto format
     */
    public TaskDTO toTaskDTO(Task task){
        taskDTO.setId(task.getId());
        taskDTO.setName(task.getTitle());
        taskDTO.setStatus(task.getStatus());
        return taskDTO;
    }

    public Task toTask(TaskDTO taskDTO){
        return new Task(taskDTO.getId(),taskDTO.getName(),taskDTO.isCompleted());
    }


}

package yousra.todo_app.demo.dto;

import java.util.UUID;

public class TaskDTO {
    private UUID id;
    private String name;
    private boolean status;

    /**
     * Getters
     */
    public UUID getId(){return id;}
    public String getName(){return name;}
    public boolean getStatus(){return status;}

    /**
     * Setters
     */
    public void setId(UUID id){this.id = id;}
    public void setName(String name){this.name=name;}
    public void setStatus(boolean status){this.status = status;};

    /**
     * Method to check the status of a task
     * @return true if as task is completed and false otherwise
     */
    public boolean isCompleted(){return this.status;}

    public String toString(){
        return "Task{" +
                "id=" + this.id +
                ", title='" + this.name + '\'' +
                ", status=" +
                '}';
    }
}

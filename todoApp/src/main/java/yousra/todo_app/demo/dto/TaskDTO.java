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

    /**
     * Setters
     */
    public void setId(UUID id){this.id = id;}
    public void setName(String name){this.name=name;}

    
}

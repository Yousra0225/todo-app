package yousra.todo_app.demo.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID id;
    @Column
    private String title;
    @Column
    private boolean completed = false;

    /**
     * Constructor of the class
     */
    public Task(UUID id, String title, Boolean completed){
        this.id = id;
        this.title= title;
        this.completed = completed;
    }
    public Task(){
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    /**
     * Getters
     */
    public UUID getId() { return this.id; }
    public String getTitle() { return this.title; }

    /**
     * Setters
     */
    public void setId(UUID id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    /**
     * Method to check if a task is completed
     * @return true if a task is completed and false otherwise
     */
    public boolean isCompleted() { return completed; }

    public String toString() {
        return "Task{" +
                "id=" + this.id +
                ", title='" + this.title + '\'' +
                ", status=" + this.completed +
                '}';
    }
}

package yousra.todo_app.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String title;
    private boolean completed = false;

    /**
     * Constructor of the class
     */
    public Task(UUID id, String title, Boolean completed){
        this.id = id;
        this.title= title;
        this.completed = completed;
    }
}

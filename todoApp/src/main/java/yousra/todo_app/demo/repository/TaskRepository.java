package yousra.todo_app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yousra.todo_app.demo.model.Task;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID>{

}

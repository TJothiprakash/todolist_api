package com.todoapi.in.todo_api.repository;


import com.todoapi.in.todo_api.entity.Todo;
import com.todoapi.in.todo_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUser(User user);
}


package com.example.todoserver.repository;


import com.example.todoserver.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {


}

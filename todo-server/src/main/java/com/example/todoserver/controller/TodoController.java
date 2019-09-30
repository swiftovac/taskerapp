package com.example.todoserver.controller;


import com.example.todoserver.model.Todo;
import com.example.todoserver.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping()
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @PostMapping()
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);

    }

    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable("id") Long id) {
        Todo t = todoRepository.getOne(id);
        todoRepository.delete(t);
        return "Todo is deleted";
    }
    @PutMapping("/{id}")
    public String updateTodo(@PathVariable("id") Long id) {
        Todo t = todoRepository.getOne(id);
        todoRepository.save(t);
        return "Todo is updated";
    }



}

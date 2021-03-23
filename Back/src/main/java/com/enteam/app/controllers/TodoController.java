package com.enteam.app.controllers;

import com.enteam.app.Todo;
import com.enteam.app.services.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }

    @PostMapping
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }

    @PutMapping
    public void changeStateTodo(@RequestBody Todo todo) {
        todoService.changeStateTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void removeTodo(@PathVariable("id") int id) { //needs a TasknotfoundException
        todoService.deleteTodo(id);
    }

    /*
    @GetMapping("/{user}")
    public Todo getTodoFromId(@PathVariable("user") String user) {
        // Query all the todos from this very suer
        return null;
    }
    */

}

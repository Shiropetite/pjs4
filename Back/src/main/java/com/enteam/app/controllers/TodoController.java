package com.enteam.app.controllers;

import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.repositories.TodoRepository;
import com.enteam.app.ressouces.Todo;
import com.enteam.app.serviceImpl.TodoServiceImpl;
import com.enteam.app.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    @Autowired
    public TodoController(TodoRepository repository, StudentRepository studentRepository) {
        this.todoService = new TodoServiceImpl(repository, studentRepository);
    }

    @GetMapping("/{user}")
    public Todo[] getTodoFromId(@PathVariable("user") Long id){
        return todoService.getTodoFromId(id);
    }

    @PostMapping("/{user}")
    public boolean addTodo(@PathVariable("user") Long id, @RequestBody Todo todo){

        return todoService.addTodo(todo,id);
    }

    @DeleteMapping("{id}")
    public boolean removeTodo(@PathVariable("id") Long todoid){
        return todoService.removeTodo(todoid);
    }

    @PutMapping
    public Todo switchAckTodo(@RequestBody Todo todo){ //tick goes from T to F or F to T
        return todoService.switchAckTodo(todo);
    }

}

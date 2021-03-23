package com.enteam.app.controllers;

import com.enteam.app.Todo;
import com.enteam.app.serviceImpl.TodoServiceImpl;
import com.enteam.app.services.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    private ArrayList<Todo> elems;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    //Methode Endpoint
    @GetMapping
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }

    @GetMapping("/{user}")
    public Todo getTodoFromId(@PathVariable("user") Integer id){
        return todoService.getTodoFromId(id);
    }

    @GetMapping
    public boolean addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @GetMapping
    public boolean removeTodo(@RequestParam("id") Integer todoid){
        return todoService.removeTodo(todoid);
    }
    @GetMapping
    public Todo switchAckTodo(@RequestParam("id") Integer todoid){ //tick goes from T to F or F to T
        return todoService.switchAckTodo(todoid);
    }
}

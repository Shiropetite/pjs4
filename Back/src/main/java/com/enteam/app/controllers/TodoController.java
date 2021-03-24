package com.enteam.app.controllers;

import com.enteam.app.ressouces.Todo;
import com.enteam.app.services.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    private List<Todo> elems;

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

    @PostMapping
    public boolean addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @DeleteMapping
    public boolean removeTodo(@RequestParam("id") Integer todoid){
        return todoService.removeTodo(todoid);
    }

    @PutMapping
    public Todo switchAckTodo(@RequestParam("id") Integer todoid){ //tick goes from T to F or F to T
        return todoService.switchAckTodo(todoid);
    }

}

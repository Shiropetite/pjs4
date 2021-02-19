package com.enteam.app.controllers;

import com.enteam.app.Todo;
import com.enteam.app.services.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    //Methode Endpoint
    @GetMapping
    public List<Todo> getTodos(){
        return Arrays.asList(
                new Todo("Billy","4","Faire les courses","Acheter des tomates et des oignons", false)
        );
    }

    @GetMapping("/{user}")
    public Todo getTodoFromId(@PathVariable("user") String user){
	    // Query all the todos from this very suer
        return null;
    }

    @GetMapping
    public List<Todo> getTodos(@RequestParam("id") String todoid){
        return null;
    }

    public boolean removeTodo(@RequestParam("id") String todoid){ //needs a TasknotfoundException
        return true;
    }

    public Todo switchAckTodo(@RequestParam("id") String todoid){ //tick goes from T to F or F to T
        return null;
    }
}

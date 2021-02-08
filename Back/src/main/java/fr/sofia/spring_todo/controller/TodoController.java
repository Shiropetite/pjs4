package fr.sofia.spring_todo.controller;

import fr.sofia.spring_todo.model.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/todos")
public class TodoController {
    private ArrayList<Todo> todoList = new ArrayList<Todo>();

    @GetMapping
    public List<Todo> getTodos(){
        System.out.println("je get");
        return todoList;
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){
        System.out.println("j'add");
	    todoList.add(todo);
	    return todo;
    }

    @DeleteMapping("/{id}")
    public void removeTodo(@PathVariable("id") int id){
        todoList.removeIf(t -> t.getId() == id);
        System.out.println("remove " + id);
    }

}

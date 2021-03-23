package com.enteam.app.services;

import com.enteam.app.Todo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public interface TodoService {

    ArrayList<Todo> getTodos();

    Todo getTodoFromId(@PathVariable("user") Integer id);

    boolean addTodo(Todo todo);

    boolean removeTodo(@RequestParam("id") Integer toDoId);

    Todo switchAckTodo(@RequestParam("id") Integer toDoId);

}

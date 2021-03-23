package com.enteam.app.services;

import com.enteam.app.Todo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TodoService {

    public List<Todo> getTodos();

    public void addTodo(Todo todo);

    public void changeStateTodo(Todo todo);

    public void deleteTodo(int id);
}

package com.enteam.app.services;

import com.enteam.app.ressouces.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoService {

    public List<Todo> getTodos();

   public Todo getTodoFromId(Integer id);

    public boolean addTodo(Todo todo);

    public boolean removeTodo(Integer toDoId);

    public Todo switchAckTodo(Integer toDoId);
}

package com.enteam.app.services;

import com.enteam.app.ressouces.Todo;

public interface TodoService {

   public Todo[] getTodoFromId(Long id);

    public boolean addTodo(Todo todo,Long id);

    public boolean removeTodo(Long toDoId);

    public Todo switchAckTodo(Todo todo);
}

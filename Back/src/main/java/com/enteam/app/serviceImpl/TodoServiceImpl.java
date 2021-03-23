package com.enteam.app.serviceImpl;

import com.enteam.app.Todo;
import com.enteam.app.services.TodoService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    private ArrayList<Todo> todos;

    public TodoServiceImpl() {
        this.todos =  new ArrayList<>();
        this.todos.add(new Todo("Billy", new Date(120, 7, 20), "Faire les courses", "Acheter des tomates et des oignons"));
    }

    @Override
    public List<Todo> getTodos() {
        return todos;
    }

    @Override
    public void addTodo(Todo todo) {
        this.todos.add(todo);
    }

    @Override
    public void changeStateTodo(Todo todo) {
        Optional<Todo> td = this.todos.stream().filter(t -> t.getId() == todo.getId()).findFirst();
        td.ifPresent(value -> value.setTick(!todo.isTick()));
    }

    @Override
    public void deleteTodo(int id) {
        todos.removeIf(t -> t.getId() == id);
    }
}

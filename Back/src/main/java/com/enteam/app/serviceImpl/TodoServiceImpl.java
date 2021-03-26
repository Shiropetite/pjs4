package com.enteam.app.serviceImpl;

import com.enteam.app.repositories.StudentRepository;
import com.enteam.app.repositories.TodoRepository;
import com.enteam.app.ressouces.Student;
import com.enteam.app.ressouces.Todo;
import com.enteam.app.services.TodoService;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.*;

@Repository
public class TodoServiceImpl implements TodoService {
    private TodoRepository repository;
    private StudentRepository studentRepository;

    public TodoServiceImpl(TodoRepository repository, StudentRepository studentRepository) {
        this.repository = repository;
        this.studentRepository = studentRepository;
    }

    public Todo[] getTodoFromId(Long id) {
        Optional<Todo[]> todos = this.repository.findTodosByOwner_Id(id);
        return todos.orElse(null);
    }

    @Override
    public boolean addTodo(Todo todo, Long id) {
        Optional<Student> s = this.studentRepository.findById(id);
        s.ifPresent(todo::setOwner);
        Todo t = this.repository.saveAndFlush(todo);
        return t != null;
    }

    @Override
    public boolean removeTodo(Long todoid) {
        Optional<Todo> todo = this.repository.findById(todoid);
        if(todo.isPresent()) {
            this.repository.delete(todo.get());
            return true;
        }
        return false;
    }

    @Override
    public Todo switchAckTodo(Todo todo) {
        Optional<Todo> t = this.repository.findById(todo.getId());
        if(t.isPresent()) {
            t.get().setTick(!t.get().isTick());
            this.repository.save(t.get());
        }
        return t.orElse(null);
    }

}


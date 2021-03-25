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

    public boolean removeTodo(Long todoid) {
        /*
        for (Todo todo : dataBank) {
            if (todo.getId().equals(todoid)) toDelete = todo;
        }
        if (toDelete == null) return false;
        dataBank.remove(toDelete);
         */
        return true;
    }

    public Todo switchAckTodo(Long todoid) {
        /*
        for (int i = 0; i < dataBank.size(); ++i) {
            if (dataBank.get(i).getId().equals(todoid)) {
                dataBank.get(i).setTick();
                return dataBank.get(i);
            }
        }*/
        return null;
    }

}


package com.enteam.app.serviceImpl;

import com.enteam.app.ressouces.Todo;
import com.enteam.app.services.TodoService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

@Repository
public class TodoServiceImpl implements TodoService {
    private ArrayList<Todo> dataBank;

    public TodoServiceImpl() {
        this.dataBank =  new ArrayList<>();
        dataBank.add(new Todo(1,new Date(121, Calendar.AUGUST,20),"Faire les courses","Acheter des tomates et des oignons", false));
        dataBank.add(new Todo(2,new Date(185, Calendar.SEPTEMBER,2),"Return to Monke","ouga ouga", false));
        dataBank.add(new Todo(1,new Date(121, Calendar.FEBRUARY,5),"Jouer a warhammer 40k","PURGE HERETICS", false));
        dataBank.add(new Todo(1,new Date(122, Calendar.OCTOBER,22),"Se tuer","go manger des chips gout cancer", false));
        dataBank.add(new Todo(2,new Date(1121, Calendar.DECEMBER,30),"Construire plus de pylones","Alien noise", false));
        dataBank.add(new Todo(3,new Date(121, Calendar.DECEMBER,17),"Faire un tedTalk sur les transphobe","Angery SJW screech", false));
    }
    public Todo toDelete = null;

    @Override
    public ArrayList<Todo> getTodos() {
        return dataBank;
    }

    public Todo getTodoFromId(Integer id) {
        for(Todo i : dataBank){
            if(i.getId().equals(id)) return i;
        }
        return null;
    }

    @Override
    public boolean addTodo(Todo todo) {
        for (Todo i:
                dataBank) {
            if(i.isEqual(todo)) return false;
        }
        dataBank.add(todo);
        return true;
    }

    public boolean removeTodo(Integer todoid) {
        for (Todo todo : dataBank) {
            if (todo.getId().equals(todoid)) toDelete = todo;
        }
        if(toDelete == null) return false;
        dataBank.remove(toDelete);
        return true;
    }

    public Todo switchAckTodo(Integer todoid) {
        for(int i=0 ; i<dataBank.size(); ++i){
            if(dataBank.get(i).getId().equals(todoid)){
                dataBank.get(i).setTick();
                return dataBank.get(i);
            }
        }
        return null;
    }

}


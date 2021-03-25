package com.enteam.app.repositories;

import com.enteam.app.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, String> {
    void findByUser(Integer user);

}
package com.example.application.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.todo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, String> {

}

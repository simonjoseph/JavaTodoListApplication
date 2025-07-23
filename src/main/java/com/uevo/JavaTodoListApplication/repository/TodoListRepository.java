package com.uevo.JavaTodoListApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uevo.JavaTodoListApplication.model.TodoList;

public interface TodoListRepository extends JpaRepository<TodoList, Long> {}

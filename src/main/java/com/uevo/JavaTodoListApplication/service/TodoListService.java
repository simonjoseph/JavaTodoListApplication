package com.uevo.JavaTodoListApplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uevo.JavaTodoListApplication.model.TodoList;
import com.uevo.JavaTodoListApplication.repository.TodoListRepository;

@Service
public class TodoListService {
    private final TodoListRepository todoListRepository;
    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public List<TodoList> getAllTodoLists() {
        return todoListRepository.findAll();
    }

    public TodoList getTodoListById(Long id) {
        return todoListRepository.findById(id).orElse(null);
    }

    public TodoList createTodoList(TodoList todoList) {
        return todoListRepository.save(todoList);
    }

    public TodoList updateTodoList(Long id, TodoList todoList) {
        if (todoListRepository.existsById(id)) {
            todoList.setId(id);
            return todoListRepository.save(todoList);
        }
        return null;
    }

    public void deleteTodoList(Long id) {
        todoListRepository.deleteById(id);
    }
}

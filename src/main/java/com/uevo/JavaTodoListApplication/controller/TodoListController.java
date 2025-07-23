package com.uevo.JavaTodoListApplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uevo.JavaTodoListApplication.model.TodoList;
import com.uevo.JavaTodoListApplication.service.TodoListService;

@RestController
@RequestMapping("/")
public class TodoListController {

    private final TodoListService todoListService;
    public TodoListController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping
    public List<TodoList> getAll() {
        return todoListService.getAllTodoLists();
    }

    @PostMapping("/create")
    public TodoList create(@RequestBody TodoList todoList) {
        return todoListService.save(todoList);
    }

    @PatchMapping("/update/{id}")
    public TodoList update(@RequestBody TodoList todoList) {
        return todoListService.updateTodoList(todoList.getId(), todoList);
    }

    @GetMapping("/get/{id}")
    public TodoList getById(@PathVariable Long id) {
        return todoListService.getTodoListById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        todoListService.deleteTodoList(id);
    }

    @GetMapping("/completed")
    public List<TodoList> getCompleted() {
        return todoListService.getAllTodoLists().stream()
                .filter(TodoList::getCompleted)
                .toList();
    }

}

package com.uevo.JavaTodoListApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TodoListController {
    public String index() {
        return "index";
    }
}

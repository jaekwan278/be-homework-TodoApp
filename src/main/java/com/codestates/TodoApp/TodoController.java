package com.codestates.TodoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class TodoController {
    @GetMapping
    public String helloWorld(){
        return "To-do Application !";
    }
}

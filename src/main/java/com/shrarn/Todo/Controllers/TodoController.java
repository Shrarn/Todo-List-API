package com.shrarn.Todo.Controllers;

import com.shrarn.Todo.Models.Todo;
import com.shrarn.Todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    //Create Todo
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo)
    {
        //Create todo
        return todoService.create(todo);
    }

    //get all Todo

    @GetMapping
    public List<Todo> getAll()
    {
        return todoService.getList();
    }

}

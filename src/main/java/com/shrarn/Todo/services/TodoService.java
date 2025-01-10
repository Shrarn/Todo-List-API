package com.shrarn.Todo.services;

import com.shrarn.Todo.Models.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> list = new ArrayList<>();

    public Todo create(Todo todo)
    {
        list.add(todo);
        return todo;
    }

    public List<Todo> getList(){
        return list;
    }

}

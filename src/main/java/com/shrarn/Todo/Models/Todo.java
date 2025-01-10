package com.shrarn.Todo.Models;


public class Todo {

    private int id;

    private String content;

    public Todo(int id, String content)
    {
        id = this.id;
        content= this.content;
    }

    public Todo()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

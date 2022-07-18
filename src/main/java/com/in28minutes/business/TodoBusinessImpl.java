package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    private TodoService todoService;

//TodoBusinessImpl SUT
//TodoService Dependency
    public TodoBusinessImpl(TodoService todoService){
        this.todoService = todoService;
    }


    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos(user);
        for(String todo:todos){
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }


        return null;
    }

}

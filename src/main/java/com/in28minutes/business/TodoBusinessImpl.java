package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    //TodoBusinessImpl SUT
    //TodoService Dependency
        private TodoService todoService;

        TodoBusinessImpl(TodoService todoService) {
            this.todoService = todoService;
        }

        public List<String> retrieveTodosRelatedToSpring(String user) {
            List<String> filteredTodos = new ArrayList<String>();
            List<String> allTodos = todoService.retrieveTodos(user);
            for (String todo : allTodos) {
                if (todo.contains("Spring")) {
                    filteredTodos.add(todo);
                }
            }
            return filteredTodos;
        }


}

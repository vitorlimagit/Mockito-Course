package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class TodoBusinessIm {

    @Test
    public void testeRetrieveTodosRelatedToSpring_usingAMock(){

        //Given
        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");

        given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        //When
        List<String> filteredTodos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");

        //Then
//        assertThat(filteredTodos.size(), is(2));

    }

}


package com.in28minutes.business;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class ListTest {

    @Test
    public void letsMockListSizeMethod() {
        //Given - setup scenario
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        //When - actual method call

        //Then - asserts
        assertEquals(2, listMock.size());

    }

    @Test
    public void letsMockListSize_ReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);

        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());

    }

    @Test(expected = RuntimeException.class)
    public void letsMockListGet_UsingBDD() {
      //Given
        List<String> listMock = mock(List.class);
        given(listMock.get(anyInt())).willReturn("in28Minutes");

        //When
       String firstElement = listMock.get(0);

       ///Then
        assertThat(firstElement, is("in28Minutes"));

    }

    @Test(expected = RuntimeException.class)
    public void letsMockList_mixingUp() {
        List listMock = mock(List.class);
        // Argument Matcher
        when(listMock.subList(anyInt(), 5)).thenThrow(new RuntimeException("Something"));


        listMock.get(0);
//        assertEquals("in28Minutes", listMock.get(0));
//        assertEquals("in28Minutes", listMock.get(1));
    }



}

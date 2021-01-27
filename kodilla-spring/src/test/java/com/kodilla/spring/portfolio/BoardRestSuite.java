package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardRestSuite {
    @Test
    public void testTaskAdding(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addDoneList("Learning Microprocessors");
        board.addInProgressList("Learning Java");
        board.addToDoList("Weekly Shopping");
        //Then
        Assertions.assertEquals("Weekly Shopping", board.getToDoList().tasks.get(0));
        Assertions.assertEquals("Learning Java", board.getInProgressList().tasks.get(0));
        Assertions.assertEquals("Learning Microprocessors", board.getDoneList().tasks.get(0));

    }
}

package com.kodilla.patterns2.observer.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TasksQueue wojtek = new StudentQueue("Wojtek");
        TasksQueue marta = new StudentQueue("Marta");
        TasksQueue kamil = new StudentQueue("Kamil");

        Task loop = new Task("Patterns2");
        Task toString = new Task("REST API");
        Task arrays = new Task("HIBERNATE");

        Mentor karol = new Mentor("Karol");
        Mentor magdalena = new Mentor("Magdalena");

        wojtek.registerMentor(karol);
        marta.registerMentor(karol);
        kamil.registerMentor(magdalena);
        //When
        wojtek.addTask(loop);
        marta.addTask(toString);
        kamil.addTask(arrays);
        //Then
        Assertions.assertEquals(2, karol.getUpdateCount());
        Assertions.assertEquals(1, magdalena.getUpdateCount());
    }
}
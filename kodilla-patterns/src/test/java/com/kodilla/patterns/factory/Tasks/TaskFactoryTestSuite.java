package com.kodilla.patterns.factory.Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    public void paintingTaskTest(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assertions.assertEquals("Paint a new painting",paintingTask.getTaskName());
        Assertions.assertTrue(paintingTask.isTaskExecuted());

    }
    @Test
    public void drivingTaskTest(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assertions.assertEquals("Test New Car",drivingTask.getTaskName());
        Assertions.assertTrue(drivingTask.isTaskExecuted());
    }
    @Test
    public void shoppingTaskTest(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assertions.assertEquals("Do the shopping",shoppingTask.getTaskName());
        Assertions.assertTrue(shoppingTask.isTaskExecuted());
    }
}

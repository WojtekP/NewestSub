package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println("Mentor: " + name + ", Student: " + tasksQueue.getStudentName()
                + " tasks: " + tasksQueue.getTasks() + ", Amount of tasks: " + tasksQueue.getTasks().size());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public List<TaskList> getTaskLists() {
        return taskLists;
    }

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public boolean removeTaskList(TaskList taskList) {
        return taskLists.remove(taskList);
    }

    public String getName() {
        return name;
    }

    public Board(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Board{" +
                "taskList=" + taskLists +
                ", name='" + name + '\'' +
                '}';
    }
}

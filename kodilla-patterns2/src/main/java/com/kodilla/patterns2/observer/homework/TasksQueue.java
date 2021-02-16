package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable {
    private final List<Task> tasks;
    private final List<Mentor> mentors;
    private final String studentName;

    public TasksQueue(String studentName) {
        this.studentName = studentName;
        tasks = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentors() {
        for (Mentor mentor : mentors) {
            mentor.update(this);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
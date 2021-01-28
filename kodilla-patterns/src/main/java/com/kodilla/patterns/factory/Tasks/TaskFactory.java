package com.kodilla.patterns.factory.Tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {
    public static final String DRIVINGTASK = "CIRCLE";
    public static final String PAINTINGTASK = "SQUARE";
    public static final String SHOPPINGTASK = "RECTANGLE";


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Test New Car", "Nearest race track","Ferrari prototype Z");
            case PAINTINGTASK:
                return new PaintingTask("Paint a new painting", "red and blue","car");
            case SHOPPINGTASK:
                return new ShoppingTask("Do the shopping", "snacks", 8);
            default:
                return null;
        }

    }
}

package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                newList.add(numbers.get(i));
            }
        }
        return newList;
    }


}
/*
firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);
        firstList.add(6);
        firstList.add(7);
        firstList.add(8);
        firstList.add(9);
        firstList.add(10);*/
package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;


import java.util.ArrayList;


public class CollectionTestSuite {


    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suite begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test suite ended");
    }

    @BeforeEach
    public void before() {
        System.out.println("Unit begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Unit test ended");

    }

    @DisplayName("test case with no list given")
    @Test
    void testCaseEmptyList() {
        ArrayList<Integer> firstList = new ArrayList<>();
        OddNumbersExterminator listing = new OddNumbersExterminator();

        ArrayList<Integer> result = new ArrayList<>();
        Assertions.assertEquals(listing.exterminate(firstList), result);


    }

    @DisplayName("test case with list")
    @Test
    void testWitchList() {
        ArrayList<Integer> secondList = new ArrayList<>();
        OddNumbersExterminator listing = new OddNumbersExterminator();

        for (int s = 1; s < 13; s++) {
            secondList.add(s);
        }
        //listing.exterminate(secondList);
        ArrayList<Integer> result = new ArrayList<>();
        for (int r = 1; r < 13; r++) {
            if (r % 2 == 0) {
                result.add(r);

            }
        }

        Assertions.assertEquals(listing.exterminate(secondList), result);

    }

}

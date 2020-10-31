package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

class ForumTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("unit tests begin");
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite begin");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Tests finished");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("test finished");
    }
    @DisplayName("the test is checking if real name is created correct")
    @Test
    void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("the forum user","John Smith");
        //When
        String answerExpectations = simpleUser.getRealName();
        System.out.println("Testing " + answerExpectations);
        //Then
        Assertions.assertEquals(answerExpectations,"John Smith");

    }

    @DisplayName("The test is checking if username created is correct")
    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String expectedResult = "theForumUser";
        //When
        String result = simpleUser.getUsername();



        //Then
        Assertions.assertEquals(expectedResult, result);

    }
}
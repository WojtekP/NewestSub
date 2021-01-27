package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    void loggerTest(){
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("hello");
        //When
        String result = logger.getLastLog();
        //Then
        Assertions.assertEquals("hello",result);


    }
}

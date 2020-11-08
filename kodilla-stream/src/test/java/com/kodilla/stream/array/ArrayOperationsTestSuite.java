package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.kodilla.stream.array.ArrayOperations;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    void testGetAverage(){
        //Given
        int[] numeric = new int[10];
        double[] numeric2 = new double[10];
        for(int i = 0; i != 10;i++){
            numeric[i] = i + 1;
        }

        //When
        OptionalDouble average = ArrayOperations.getAverage(numeric);
        //Then
        Assertions.assertEquals(5.5,average.getAsDouble());

    }
}

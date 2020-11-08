package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
   public static OptionalDouble getAverage(int[] numbers){
       IntStream.range(0, numbers.length)
               .forEach(System.out::print);

       OptionalDouble averages = IntStream.range(0,numbers.length)
               .average();


       return averages;
   };
}
